package com.cine.trivia_cine.model;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String peliculaCorrecta;

    @Column(nullable = false)
    private String gifUrl;

    private String opcion1;
    private String opcion2;
    private String opcion3;

    public Pregunta() {}

    // Getters y Setters
    public Long getId() { return id; }
    public String getPeliculaCorrecta() { return peliculaCorrecta; }
    public void setPeliculaCorrecta(String peliculaCorrecta) { this.peliculaCorrecta = peliculaCorrecta; }
    public String getGifUrl() { return gifUrl; }
    public void setGifUrl(String gifUrl) { this.gifUrl = gifUrl; }
    public String getOpcion1() { return opcion1; }
    public void setOpcion1(String opcion1) { this.opcion1 = opcion1; }
    public String getOpcion2() { return opcion2; }
    public void setOpcion2(String opcion2) { this.opcion2 = opcion2; }
    public String getOpcion3() { return opcion3; }
    public void setOpcion3(String opcion3) { this.opcion3 = opcion3; }
}