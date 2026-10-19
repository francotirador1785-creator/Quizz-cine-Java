package com.cine.trivia_cine.controller;

import com.cine.trivia_cine.model.Pregunta;
import com.cine.trivia_cine.model.Usuario;
import com.cine.trivia_cine.service.TriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cine.trivia_cine.model.RespuestaDTO;

import java.util.List;

@RestController
@RequestMapping("/api/trivia")
@CrossOrigin(origins = "*") // Permite peticiones desde la app de React Native/Expo o web
public class TriviaController {

    @Autowired
    private TriviaService triviaService;

    // 1. Endpoint de estado para comprobar disponibilidad
    @GetMapping("/estado")
    public String verificarEstado() {
        return "El Backend de la Trivia de Cine está funcionando";
    }

    // 2. Obtener todas las preguntas/escenas
    @GetMapping("/preguntas")
    public List<Pregunta> obtenerPreguntas() {
        return triviaService.obtenerTodasLasPreguntas();
    }

    // 3. Registrar usuario o actualizar su récord
    @PostMapping("/registro")
    public Usuario registrarUsuario(@RequestParam String nombre, @RequestParam int puntaje) {
        return triviaService.registrarOActualizarUsuario(nombre, puntaje);
    }

    // 4. Consultar el ranking de puntajes
    @GetMapping("/ranking")
    public List<Usuario> obtenerRanking() {
        return triviaService.obtenerRanking();
    }

    // Endpoint para validar si la respuesta enviada por el usuario es correcta
    @PostMapping("/validar")
    public boolean validarRespuesta(@RequestBody RespuestaDTO respuesta) {
        return triviaService.validarRespuesta(respuesta.getPreguntaId(), respuesta.getOpcionSeleccionada());
    }
}