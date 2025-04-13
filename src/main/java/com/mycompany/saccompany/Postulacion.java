/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saccompany;

/**
 *
 * @author crist
 */
public class Postulacion {
    private Trabajador candidato;
    private Proyecto proyecto;
    private String descripcion;
    private String respuesta;

    public Postulacion() {
    }

    public Postulacion(Trabajador candidato, String descripcion, String respuesta, Proyecto proyecto) {
        this.candidato = candidato;
        this.descripcion = descripcion;
        this.respuesta = respuesta;
        this.proyecto = proyecto;
    }

    public Trabajador getCandidato() {
        return candidato;
    }

    public void setCandidato(Trabajador candidato) {
        this.candidato = candidato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Postulacion{");
        sb.append("candidato=").append(candidato);
        sb.append(", proyecto=").append(proyecto);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", respuesta=").append(respuesta);
        sb.append('}');
        return sb.toString();
    }
    
}
