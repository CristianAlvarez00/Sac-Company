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
public class Proyecto {
    private String empresa;
    private String titulo;
    private String descripcion;
    private String modalidad;
    private String salario;
    private String pais;
    private Empleador usuario;
    private ArrayList <Postulacion> listaPostulaciones = new ArrayList<>();
    private String fechaTerminacion;

    public Proyecto(String empresa, String titulo, String descripcion, String oferta, String modalidad, int categoria, String salario, String pais, Empleador usuario, String fechaTerminacion) {
        this.empresa = empresa;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.modalidad = modalidad;
        this.salario = salario;
        this.pais = pais;
        this.usuario = usuario;
        this.fechaTerminacion = fechaTerminacion;
    }

    public Proyecto() {
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

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Empleador getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleador usuario) {
        this.usuario = usuario;
    }    
    
    public void agregarPostulacion(Postulacion postulacion){
        listaPostulaciones.add(postulacion);

    }

    public String getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(String fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }
    public ArrayList <Postulacion> getListaPostulaciones() {
        return listaPostulaciones;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proyecto{");
        sb.append("empresa=").append(empresa);
        sb.append(", titulo=").append(titulo);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", modalidad=").append(modalidad);
        sb.append(", salario=").append(salario);
        sb.append(", pais=").append(pais);
        sb.append(", usuario=").append(usuario);
        sb.append(", listaPostulaciones=").append(listaPostulaciones);
        sb.append(", fechaTerminacion=").append(fechaTerminacion);
        sb.append('}');
        return sb.toString();
    }    
}
