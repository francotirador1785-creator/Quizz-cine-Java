package com.cine.trivia_cine.repository;

import com.cine.trivia_cine.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByNombre(String nombre);

    // Obtener la lista ordenada de mayor a menor puntaje
    List<Usuario> findAllByOrderByPuntajeMaximoDesc();
}