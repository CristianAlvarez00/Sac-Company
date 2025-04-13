/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saccompany;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Trabajador extends Persona{
    private ArrayList <Contrato> listaContratos = new ArrayList<>();
    private ArrayList <Postulacion> listaPostulaciones = new ArrayList<>();
    private int idioma;
    private int estudios;
    private double experiencias;
    private String descripcion;

    public Trabajador() {
    }

    public Trabajador(int idioma, int estudios, double experiencias, String descripcion, String nombre, String telefono, String pais, String correoElectronico) {
        super(nombre, telefono, pais, correoElectronico);
        this.idioma = idioma;
        this.estudios = estudios;
        this.experiencias = experiencias;
        this.descripcion = descripcion;       
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdioma() {
        return idioma;
    }

    public void setIdioma(int idioma) {
        this.idioma = idioma;
    }

    public int getEstudios() {
        return estudios;
    }

    public void setEstudios(int estudios) {
        this.estudios = estudios;
    }

    public double getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(double experiencias) {
        this.experiencias = experiencias;
    }
    
    public String getIdiomaString() {
        switch (idioma) {
            case 1: 
                return "Español";
            case 2: 
                return "Español e Inglés";
            case 3: 
                return "Español, Inglés y Alemán";
            default: 
                return "Desconocido";
        }
    }

    public String getEstudiosString() {
        switch (estudios) {
            case 1: 
                return "Sin estudios";
            case 2: 
                return "Diplomado/Certificado";
            case 3: 
                return "Tecnólogo";
            case 4: 
                return "Profesional";
            default: 
                return "Desconocido";
        }
    }

    public ArrayList <Contrato> getListaContratos() {
        return listaContratos;
    
    }public void agregarContrato(Contrato contrato){
        listaContratos.add(contrato);
    }    
    public ArrayList <Postulacion> getListaPostulaciones() {
        return listaPostulaciones;
    
    }public void agregarPostulacion(Postulacion postulacion){
        listaPostulaciones.add(postulacion);
    }        
}
