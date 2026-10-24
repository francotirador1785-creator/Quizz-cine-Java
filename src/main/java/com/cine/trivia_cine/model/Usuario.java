package com.cine.trivia_cine.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre; // El nametag que ingresa el usuario

    private int puntajeMaximo = 0;

    // 1. Constructor vacío (Obligatorio para JPA/Hibernate)
    public Usuario() {}

    // 2. Constructor solo con nombre
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // 3. Constructor con nombre y puntaje máximo (¡Este era el que faltaba!)
    public Usuario(String nombre, int puntajeMaximo) {
        this.nombre = nombre;
        this.puntajeMaximo = puntajeMaximo;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPuntajeMaximo() { return puntajeMaximo; }
    public void setPuntajeMaximo(int puntajeMaximo) { this.puntajeMaximo = puntajeMaximo; }
}