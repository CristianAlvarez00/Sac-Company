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
public class GestionarProyecto {
    private ArrayList <Proyecto> listaProyecto = new ArrayList<>();    

    public void crearProyecto(Empleador empleador){
        Proyecto proyecto = new Proyecto();
        proyecto.setUsuario(empleador);
        proyecto.setEmpresa(empleador.getEmpresa());
        proyecto.setTitulo(Funciones.pedirString("Ingrese el titulo que desee para el proyecto"));
        proyecto.setDescripcion(Funciones.pedirString("Ingrese la descripcion del proyecto. Que es lo que busca, que es lo que necesita."));
        proyecto.setModalidad(Funciones.pedirString("Ingrese la modalidad en la que requiere al freelancer (presencial, virtual o remota, hibrida, etc)"));
        proyecto.setPais(Funciones.pedirString("Ingrese el pais de donde requiere al freelancer"));
        proyecto.setSalario(Funciones.pedirString("Ingrese el salario del freelancer, en la moneda que prefiera."));
        proyecto.setFechaTerminacion(Funciones.pedirString("Ingrese la fecha maxima de terminacion del proyecto"));        
        agregarProyecto(proyecto);
        empleador.agregarProyecto(proyecto);
        JOptionPane.showMessageDialog(null, "Proyecto creado exitosamente!");        
    }
    public void mostrarProyectos(ArrayList<Proyecto> lista){
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay ningun proyecto publicado. Lo sentimos");
            return;
        }
        for (int i = 0; i < lista.size(); i++){
            Proyecto proyecto = lista.get(i);
            JOptionPane.showMessageDialog(null, "PROYECTO " + (i + 1) + "\n\n" +
            "Empresa: " + proyecto.getEmpresa() + "\n" + 
            "Titulo del proyecto: " + proyecto.getTitulo() + "\n" + 
            "Descripcion del proyecto: " + proyecto.getDescripcion()+ "\n" +
            "Modalidad: " + proyecto.getModalidad()+ "\n" +
            "Pais requerido: " + proyecto.getPais() + "\n" +
            "Salario: " + proyecto.getSalario() + "\n" +
            "Fecha maxima de terminacion: " + proyecto.getFechaTerminacion() + "\n");
        }
    }
    public Proyecto escogerProyecto(ArrayList<Proyecto> lista){        
        mostrarProyectos(lista);
        if (lista.isEmpty()){
            return null;
        }
        int opc = Funciones.pedirEntero("Ingrese el numero de la proyecto que desea revisar") - 1;
            if (opc >= lista.size()){
                JOptionPane.showMessageDialog(null, "Ingresaste una opcion invalida. Retornando al menu princiapal");
                return null;
            }else{
                return lista.get(opc);
            }                              
        
    }public ArrayList <Proyecto> getListaProyecto() {
        return listaProyecto;
    
    }public void agregarProyecto(Proyecto proyecto){
        listaProyecto.add(proyecto);
    } 
}

