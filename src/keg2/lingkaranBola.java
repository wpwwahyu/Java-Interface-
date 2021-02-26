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
public class lingkaranBola implements bangunRuang, Bola{
    double phi = 3.14;

    @Override
    public double getVolume() {
        double r = getJari();
        double volume = 4/3*phi*r*r*r;
        System.out.println("Volume bola adalah : "+volume);
        return 0;
    }

    @Override
    public double getLuas() {
        double r = getJari();
        double luas = phi*r*r;
        System.out.println("Luas bola adalah : "+luas);
        return 0;
    }

    @Override
    public double getJari() {
        double r = 8;
        return (r);
    }
    
}
