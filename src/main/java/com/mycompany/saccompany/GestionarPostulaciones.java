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
public class GestionarPostulaciones {
    public void crearPostulacion(Trabajador trabajador, Proyecto proyecto){
        Postulacion postulacion = new Postulacion();
        postulacion.setCandidato(trabajador);
        postulacion.setProyecto(proyecto);
        postulacion.setDescripcion(Funciones.pedirString("Describe tu interes o experiencia para el proyecto"));
        postulacion.setRespuesta("Pendiente");
        trabajador.agregarPostulacion(postulacion);     
        proyecto.agregarPostulacion(postulacion);
        JOptionPane.showMessageDialog(null,"Postulacion creada exitosamente!");
    }
    public void mostrarPostulaciones(Proyecto proyecto){
        ArrayList <Postulacion> arreglo = proyecto.getListaPostulaciones();
        if (arreglo.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay postulaciones para este proyecto actualmente");
            return;
        }
        for (int i = 0; i < arreglo.size(); i++){
        Postulacion postulacion = arreglo.get(i);
        Trabajador candidato = postulacion.getCandidato();
        String mensaje = "POSTULACIÓN " + (i + 1) + "\n\n" +
            "Candidato: " + candidato.getNombre() + "\n" +
            "Nivel de estudios: " + candidato.getEstudiosString() + "\n" +
            "Descripción del candidato: " + candidato.getDescripcion() + "\n" +
            "Idiomas dominados: " + candidato.getIdiomaString() + "\n" +
            "Experiencia laboral: " + candidato.getExperiencias() + " años\n" +
            "Comentario del candidato sobre el proyecto: " + postulacion.getDescripcion() + "\n" +
            "Estado: " + postulacion.getRespuesta();
        JOptionPane.showMessageDialog(null, mensaje);       
        }        
    }
    public void mostrarPostulaciones(Trabajador trabajador){
        ArrayList <Postulacion> arreglo = trabajador.getListaPostulaciones();
        if (arreglo.isEmpty()){
            JOptionPane.showMessageDialog(null, "No has realizado ninguna postulacion");
            return;
        }
        for (int i = 0; i < arreglo.size(); i++){
            Postulacion postulacion = arreglo.get(i);
            String mensaje = "POSTULACIÓN " + (i + 1) + "\n\n" +
                "Candidato: " + trabajador.getNombre() + "\n" +
                "Nivel de estudios: " + trabajador.getEstudiosString()+ "\n" +
                "Descripción del candidato: " + postulacion.getCandidato().getDescripcion() + "\n" +
                "Idiomas dominados: " + trabajador.getIdiomaString()+ "\n" +
                "Experiencia laboral: " + trabajador.getExperiencias() + " años\n" +
                "Comentario del candidato: " + postulacion.getDescripcion() + "\n" +
                "Contacto del candidato: " + postulacion.getCandidato().getTelefono() +", " + 
                 postulacion.getCandidato().getCorreoElectronico() + "\n" +                    
                "Estado: " + postulacion.getRespuesta(); 
            JOptionPane.showMessageDialog(null, mensaje);        
        }        
    }
    public Trabajador escogerPostulacion(Proyecto proyecto){
        
        mostrarPostulaciones(proyecto);
        if (proyecto.getListaPostulaciones().isEmpty()){
            return null;
        }
        
        int opc = JOptionPane.showConfirmDialog(null, 
                "Quieres aceptar alguna postulacion?", 
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opc ==1){
            JOptionPane.showMessageDialog(null, "Volviendo al menu anterior");            
        }else{
            opc = Funciones.pedirEntero("Ingrese el numero de la postulacion que quiere aceptar para el trabajo") - 1;
            ArrayList <Postulacion> arreglo = proyecto.getListaPostulaciones();
            if (opc >= arreglo.size()){
                JOptionPane.showMessageDialog(null, "Ingresaste una opcion invalida. Retornando al menu princiapal");
            }else{
                Trabajador aprobado = proyecto.getListaPostulaciones().get(opc).getCandidato();
                proyecto.getListaPostulaciones().get(opc).setRespuesta("Aprobado");
                JOptionPane.showMessageDialog(null, "Candidato aprobado exitosamente");
                proyecto.getListaPostulaciones().remove(opc);
                return aprobado;                
            }
        }return null;      
    }
}
