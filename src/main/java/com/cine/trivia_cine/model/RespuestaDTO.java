package com.cine.trivia_cine.model;

public class RespuestaDTO {
    private Long preguntaId;
    private String opcionSeleccionada;

    // Constructores
    public RespuestaDTO() {}

    public RespuestaDTO(Long preguntaId, String opcionSeleccionada) {
        this.preguntaId = preguntaId;
        this.opcionSeleccionada = opcionSeleccionada;
    }

    // Getters y Setters
    public Long getPreguntaId() {
        return preguntaId;
    }

    public void setPreguntaId(Long preguntaId) {
        this.preguntaId = preguntaId;
    }

    public String getOpcionSeleccionada() {
        return opcionSeleccionada;
    }

    public void setOpcionSeleccionada(String opcionSeleccionada) {
        this.opcionSeleccionada = opcionSeleccionada;
    }
}