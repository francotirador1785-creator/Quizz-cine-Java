package com.cine.trivia_cine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trivia")
public class TriviaController {

    @GetMapping("/estado")
    public String verificarEstado() {
        return "¡El Backend de la Trivia de Cine está funcionando correctamente con PostgreSQL!";
    }
}