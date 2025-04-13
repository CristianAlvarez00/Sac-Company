/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saccompany;

import com.mycompany.saccompany.utilidades.Funciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class GestionarEmpleador {
     private ArrayList <Empleador> listaEmpleador = new ArrayList<>();    
        public Empleador crearEmpleador(){
        Empleador empleador = new Empleador();
        empleador.setNombre(Funciones.pedirString("ingrese su nombre"));
        empleador.setTelefono(Funciones.pedirString("Ingrese su numero de telefono (sin puntos, comas ni espacios)"));
        while (!empleador.getTelefono().matches("\\d+")){
            JOptionPane.showMessageDialog(null, "Solo se permiten números.");
            empleador.setTelefono(Funciones.pedirString("Ingrese su numero de telefono (sin puntos, comas ni espacios)"));
        }
        empleador.setPais(Funciones.pedirString("ingrese el pais donde reside"));
        empleador.setCorreoElectronico(Funciones.pedirString("ingrese su correo electronico"));
        empleador.setEmpresa(Funciones.pedirString("Ingrese la empresa a la cual esta afiliado. En caso contrario, o {independiente} en caso de no estar afiliado a alguna."));
        empleador.setTiempo(Funciones.pedirString("Ingrese el tiempo que lleva la empresa en el mercado, o el tiempo que lleva usted como independiente."));
        empleador.setDescripcion(Funciones.pedirString("Ingrese una descripcion breve de la empresa, o de si mismo."));
        listaEmpleador.add(empleador);
        JOptionPane.showMessageDialog(null, "Te has registrado exitosamente!"); 
        return empleador;
    }
    public Empleador buscarEmpleador(String nombre) {
        for (Empleador empleador : listaEmpleador) {
            if (empleador.getNombre().equals(nombre)) {
                return empleador;
            }
        }
        return null;
    }    
}
