package com.cine.trivia_cine.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    private int puntajeMaximo;

    public Usuario() {}

    public Usuario(String nombre, int puntajeMaximo) {
        this.nombre = nombre;
        this.puntajeMaximo = puntajeMaximo;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getPuntajeMaximo() { return puntajeMaximo; }
    public void setPuntajeMaximo(int puntajeMaximo) { this.puntajeMaximo = puntajeMaximo; }
}