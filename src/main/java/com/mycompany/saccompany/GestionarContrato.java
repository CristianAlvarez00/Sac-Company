    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saccompany;

/**
 *
 * @author crist
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mycompany.saccompany.utilidades.Funciones;

public class GestionarContrato {
    //private ArrayList <Contrato> listaContrato = new ArrayList<>(); 
    public void crearContrato(Empleador empleador, Trabajador trabajador, Proyecto proyecto){
        Contrato contrato = new Contrato();
        contrato.setEmpleador(empleador);
        contrato.setTrabajador(trabajador); 
        contrato.setFechaAfiliacion(Funciones.pedirString("Ingresa la fecha actual (inicio del contrato)"));
        contrato.setFechaTerminacion(proyecto.getFechaTerminacion());
        contrato.setDescripcion("Mediante el presente, SAC establece un contrato entre " + empleador.getNombre() + " (empleador) y " + trabajador.getNombre() + " (empleado), vigente desde " + contrato.getFechaAfiliacion() + " hasta " + contrato.getFechaTerminacion() + ", en el proyecto llamado " + proyecto.getTitulo());
        JOptionPane.showMessageDialog(null, contrato.getDescripcion());
        trabajador.agregarContrato(contrato);
        empleador.agregarContrato(contrato);         
    }
    public void mostrarContratos(ArrayList<Contrato> arreglo){
        if (arreglo.isEmpty()){
            JOptionPane.showMessageDialog(null, "No tienes ningun contrato asociado.");
            return;
        }
        for (int i = 0; i < arreglo.size(); i++){
            Contrato contrato = arreglo.get(i);
            JOptionPane.showMessageDialog(null, "CONTRATO " + (i + 1) + "\n\n" +
            contrato.getDescripcion());            
        }    
    }
}
