package com.cine.trivia_cine.service;

import com.cine.trivia_cine.model.Pregunta;
import com.cine.trivia_cine.model.Usuario;
import com.cine.trivia_cine.repository.PreguntaRepository;
import com.cine.trivia_cine.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TriviaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Pregunta> obtenerTodasLasPreguntas() {
        return preguntaRepository.findAll();
    }

    public Usuario registrarOActualizarUsuario(String nombre, int puntaje) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findByNombre(nombre);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            if (puntaje > usuario.getPuntajeMaximo()) {
                usuario.setPuntajeMaximo(puntaje);
                return usuarioRepository.save(usuario);
            }
            return usuario;
        } else {
            Usuario nuevoUsuario = new Usuario(nombre, puntaje);
            return usuarioRepository.save(nuevoUsuario);
        }
    }

    public List<Usuario> obtenerRanking() {
        return usuarioRepository.findAll();
    }
}