/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bol14;

/**
 *
 * @author clagosuarez
 */
public class TemperaturaErradaExcepcion extends Exception{
    public TemperaturaErradaExcepcion(){
       super();
    }
    public TemperaturaErradaExcepcion(String mensaxe){
        super(mensaxe);
    }
}
