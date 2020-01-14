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
public class ConversorTemperaturas {
    private final int constante = 80;
    public double centigradosAFharenheit(float c) throws TemperaturaErradaExcepcion{
        if (c < 80) {
            throw new TemperaturaErradaExcepcion(" Recorda que a temperatura non pode ser < 80 ºC ");
        }else{
            double f = 9.0 / 5.0 * c + 32.4;
            return f;
        }
    }
    public double centígradosAReamur(float c){
        double r = 5.0 / 4.0 * c;
        return r;
    }
}
