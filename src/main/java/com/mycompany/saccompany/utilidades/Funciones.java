/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saccompany.utilidades;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Funciones {
    public static int pedirEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog(mensaje);
                numero = Integer.parseInt(entrada);
                if (numero > 0){
                    valido = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Ingresaste un numero negativo. Por favor, ingrese un número válido.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Caracter invalido. Por favor, ingrese un número válido.");
            }
        }
        return numero;
    }
    public static boolean validarVacio(String x){
        boolean valido = false;
        if (x != null && !x.trim().isEmpty()) {
            valido = true;
        } else {
            JOptionPane.showMessageDialog(null, "no puedes ingresar vacío.");
        }
        return valido;
    }

    public static String pedirString(String mensaje) {
        String texto;
        do {
            texto = JOptionPane.showInputDialog(mensaje);
            if (texto == null || texto.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacío.");
            }
        } while (texto == null || texto.trim().isEmpty());
        return texto;
    }
    public static double pedirDoble(String mensaje) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog(mensaje);
                numero = Double.parseDouble(entrada);
                if (numero > 0){
                    valido = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Ingresaste un numero negativo. Por favor, ingrese un número válido.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Caracter invalido. Por favor, ingrese un número válido.");
            }
        }
        return numero;
    }
}
