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
public class Empleador extends Persona {
  private String empresa;
  private String tiempo;
  private String descripcion;
  private ArrayList <Proyecto> misProyectos = new ArrayList<>();
  private ArrayList <Contrato> misContratos = new ArrayList<>();

  
  

    public Empleador() {
    }

    public Empleador(String empresa, String tiempo, String descripcion, String nombre, String telefono, String pais, String correoElectronico) {
        super(nombre, telefono, pais, correoElectronico);
        this.empresa = empresa;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    public ArrayList <Proyecto> getMisProyectos() {
        return misProyectos;
    
    }public void agregarProyecto(Proyecto proyecto){
        misProyectos.add(proyecto);
}            
    public ArrayList <Contrato> getMisContratos() {
        return misContratos;
    
    }public void agregarContrato(Contrato Contrato){
        misContratos.add(Contrato);
    }    
}
