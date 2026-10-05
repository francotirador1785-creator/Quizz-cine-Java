package com.cine.trivia_cine.repository;

import com.cine.trivia_cine.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
}