/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keg2;

/**
 *
 * @author Pepita Neysa
 */
public class kotakBalok implements bangunRuang{
    double p = 3;
    double l = 4;
    double t = 5;

    @Override
    public double getVolume() {
        double volume = p*l*t;
        System.out.println("Volume balok adalah : "+volume);
        return 0;
    }

    @Override
    public double getLuas() {
        double luas = 2*(p*l+p*t+l*t);
        System.out.println("Luas balok adalah : "+luas);
        return 0;
    }
    
}
