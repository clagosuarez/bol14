/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bol14;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConversorTemperaturas obj = new ConversorTemperaturas();
        System.out.println("Escribe un valor en grados °C:");
        float c  = teclado.nextFloat();
        
        try{
        System.out.println(obj.centigradosAFharenheit(c)+" °F");
        }catch(TemperaturaErradaExcepcion e1){
            System.out.println("El error es: " +e1.getMessage());
        }
        try{
        System.out.println(obj.centígradosAReamur(c)+" °Re");
        }catch(TemperaturaErradaExcepcion e1){
            System.out.println("El error es: " +e1.getMessage());
        }
        
    }

}
