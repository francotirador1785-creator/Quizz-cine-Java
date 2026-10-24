package com.cine.trivia_cine.model;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gifUrl;          // Enlace externo (ej: Giphy)
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;         // Añadida para cumplir con el prototipo de 4 opciones
    private String peliculaCorrecta;

    // Constructores, Getters y Setters
    public Pregunta() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getGifUrl() { return gifUrl; }
    public void setGifUrl(String gifUrl) { this.gifUrl = gifUrl; }

    public String getOpcion1() { return opcion1; }
    public void setOpcion1(String opcion1) { this.opcion1 = opcion1; }

    public String getOpcion2() { return opcion2; }
    public void setOpcion2(String opcion2) { this.opcion2 = opcion2; }

    public String getOpcion3() { return opcion3; }
    public void setOpcion3(String opcion3) { this.opcion3 = opcion3; }

    public String getOpcion4() { return opcion4; }
    public void setOpcion4(String opcion4) { this.opcion4 = opcion4; }

    public String getPeliculaCorrecta() { return peliculaCorrecta; }
    public void setPeliculaCorrecta(String peliculaCorrecta) { this.peliculaCorrecta = peliculaCorrecta; }
}