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

	@Bean //indica a un contenedor que un metodo crea, configura y DEVUELVE un objeto
	CommandLineRunner /*es una interfaz especial que da Springboot y senaliza que al arrancar corra todo esto*/ initDatabase(PreguntaRepository preguntaRepository) { //nombre del metodo, y se le pasan dos parametros
		return args -> {
			if (preguntaRepository.count() == 0) {
				// Pregunta 1
				Pregunta p1 = new Pregunta();
				p1.setPeliculaCorrecta("The Matrix");
				p1.setGifUrl("https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjEx.../giphy.gif");
				p1.setOpcion1("Inception");
				p1.setOpcion2("The Matrix");
				p1.setOpcion3("Interstellar");
				preguntaRepository.save(p1);

				// Pregunta 2
				Pregunta p2 = new Pregunta();
				p2.setPeliculaCorrecta("Jurassic Park");
				p2.setGifUrl("https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjEx.../giphy.gif");
				p2.setOpcion1("Jurassic Park");
				p2.setOpcion2("King Kong");
				p2.setOpcion3("Avatar");
				preguntaRepository.save(p2);
			}
		};
	}
}