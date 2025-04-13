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
public class GestionarTrabajador {
        private static ArrayList <Trabajador> listaTrabajador = new ArrayList();    
        public Trabajador crearTrabajador(){
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre(Funciones.pedirString("ingrese su nombre"));
        trabajador.setTelefono(Funciones.pedirString("Ingrese su numero de telefono (sin puntos, comas ni espacios)"));
        while (!trabajador.getTelefono().matches("\\d+")){
            JOptionPane.showMessageDialog(null, "Solo se permiten números.");
            trabajador.setTelefono(Funciones.pedirString("Ingrese su numero de telefono (sin puntos, comas ni espacios)"));
        }
        trabajador.setPais(Funciones.pedirString("ingrese el pais donde reside"));
        trabajador.setCorreoElectronico(Funciones.pedirString("ingrese su correo electronico"));
        trabajador.setIdioma(Funciones.pedirEntero("Ingrese los idiomas que domina:\n\t1. Solo español\n\t2. Español e inglés\n\t3. Español, ingles y alemán"));
        trabajador.setEstudios(Funciones.pedirEntero("Ingrese su nivel de estudios:\n\t1. Sin estudios\n\t2. Certificados-diplomados \n\t3. Tecnologia \n\t4. Pregrado"));
        trabajador.setExperiencias(Funciones.pedirDoble("Ingrese su experiencia laboral en años: "));
        trabajador.setDescripcion(Funciones.pedirString("Ingrese su descripcion: Sus habilidades, lenguajes de programacion que maneja, referencias, etc."));
        listaTrabajador.add(trabajador);
        JOptionPane.showMessageDialog(null, "Te has registrado exitosamente!");  
        return trabajador;
        }
        
        public Trabajador buscarTrabajador(String nombre) {
            for (Trabajador trabajador : listaTrabajador) {
                if (trabajador.getNombre().equals(nombre)) {
                    return trabajador;
                }            
            }
            return null;
        }            
}
