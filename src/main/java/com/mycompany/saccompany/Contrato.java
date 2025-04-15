    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saccompany;

/**
 *
 * @author crist
 */
public class Contrato {
    private Empleador empleador;
    private Trabajador trabajador;
    private String fechaAfiliacion;
    private String fechaTerminacion;
    private String descripcion;
    private Proyecto proyecto;

    public Contrato() {
    }

    public Contrato(Empleador empleador, Trabajador trabajador, String fechaAfiliacion, String fechaTerminacion, String descripcion, Proyecto proyecto) {
        this.empleador = empleador;
        this.trabajador = trabajador;
        this.fechaAfiliacion = fechaAfiliacion;
        this.fechaTerminacion = fechaTerminacion;
        this.descripcion = descripcion;
        this.proyecto = proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empleador getEmpleador() {
        return empleador;
    }

    public void setEmpleador(Empleador empleador) {
        this.empleador = empleador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public String getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(String fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public String getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(String fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    

}

