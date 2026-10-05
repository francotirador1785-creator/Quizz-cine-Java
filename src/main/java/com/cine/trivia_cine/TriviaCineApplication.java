package com.cine.trivia_cine;

import com.cine.trivia_cine.model.Pregunta;
import com.cine.trivia_cine.repository.PreguntaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TriviaCineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriviaCineApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(PreguntaRepository preguntaRepository) {
		return args -> {
			if (preguntaRepository.count() == 0) {
				Pregunta p1 = new Pregunta();
				p1.setPeliculaCorrecta("The Matrix");
				p1.setGifUrl("https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjEx.../giphy.gif");
				p1.setOpcion1("Inception");
				p1.setOpcion2("The Matrix");
				p1.setOpcion3("Interstellar");
				preguntaRepository.save(p1);
			}
		};
	}
}