/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saccompany;
import com.mycompany.saccompany.utilidades.Funciones;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class SacCompany {
    static GestionarEmpleador empleador = new GestionarEmpleador();
    static GestionarContrato contrato = new GestionarContrato();
    static GestionarTrabajador trabajador = new GestionarTrabajador();
    static GestionarPostulaciones postular = new GestionarPostulaciones();
    static GestionarProyecto proyecto = new GestionarProyecto();

    public static void menu() {

        int opc = 0;
        while (opc != 3) {

            opc = Funciones.pedirEntero("BIENVENIDO A SAC\n\n\nMenu de opciones\n\n\n\t1. Ingresar como empleador\n\t2. Ingresar como trabajador\n\t3. Salir");
            switch (opc) {
                case 1:
                    menuEmpleador();
                    break;
                case 2:
                    menuTrabajador();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Hasta pronto!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta. Ingresa una opcion valida");
                    break;
            }
        }
    }

    public static void menuEmpleador() {
        int opc = Funciones.pedirEntero("EMPLEADOR\n\t1. registrarte como empleador\n\t"
                + "2. Ingresar como empleador (si ya estas registrado)\n\t 3. Salir"
        );

        Empleador persona;
        persona = null;
        switch (opc) {
            case 1:
                persona = empleador.crearEmpleador();
                break;
            case 2:
                persona = empleador.buscarEmpleador(Funciones.pedirString("Ingrese el nombre con el que se registro en la plataforma"));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Volviendo al menu inicial!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Volviendo al menu inicial!");
                return;
        }

        if (persona != null) {
            while (opc != 5) {
                opc = Funciones.pedirEntero("Bienvenido, " + persona.getNombre() + "!\n\t1. para crear un proyecto\n\t2. para mirar los proyectos que has publicado \n\t3. para revisar postulaciones\n\t4. Mirar mis contratos\n\t5. Salir");
                switch (opc) {
                    case 1:
                        proyecto.crearProyecto(persona);
                        break;
                    case 3:
                        Proyecto proy = proyecto.escogerProyecto(persona.getMisProyectos());
                        if (proy != null) {
                            Trabajador candidato = postular.escogerPostulacion(proy);
                            if (candidato != null) {
                                contrato.crearContrato(persona, candidato, proy);
                            }
                        }
                        break;
                    case 2:
                        proyecto.mostrarProyectos(persona.getMisProyectos());
                        break;
                    case 4:
                        contrato.mostrarContratos(persona.getMisContratos());
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Volviendo al menu anterior");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta. Ingresa una opcion valida.");
                        break;

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "no encontramos tu nombre registrado! Vuelve a intentarlo, o registrate.");
        }
    }

    public static void menuTrabajador() {
        Trabajador persona;
        persona = null;
        int opc = Funciones.pedirEntero("FREELANCER\n\t1. registrarte como freelancer\n\t2. Ingresar como freelancer (si ya estas registrado)\n\t3. Salir");
        switch (opc) {
            case 1:
                persona = trabajador.crearTrabajador();
                break;
            case 2:
                persona = trabajador.buscarTrabajador(Funciones.pedirString("Ingrese el nombre con el que se registro en la plataforma"));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Volviendo al menu inicial");
                return;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta. Ingresa una opcion valida");
                break;
        }
        if (persona != null) {
            while (opc != 5) {
                opc = Funciones.pedirEntero("Bienvenido, " + persona.getNombre() + "!\n\t1. Revisar tus contratos\n\t2. Revisar tus postulaciones\n\t3. Mirar los proyectos existentes\n\t4. Crear una postulacion para un proyecto\n\t5.Salir");
                switch (opc) {
                    case 1:
                        contrato.mostrarContratos(persona.getListaContratos());
                        break;
                    case 2:
                        postular.mostrarPostulaciones(persona);
                        break;
                    case 3:
                        proyecto.mostrarProyectos(proyecto.getListaProyecto());
                        break;
                    case 4:
                        Proyecto proy = proyecto.escogerProyecto(proyecto.getListaProyecto());
                        if (proy != null) {
                            postular.crearPostulacion(persona, proy);
                            break;
                        }
                    default:
                        JOptionPane.showMessageDialog(null, "Volviendo al menu anterior");
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "no encontramos tu nombre registrado! lo sentimos.");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
