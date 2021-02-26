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
public class persegiKubus implements bangunRuang{
    double s = 4;

    @Override
    public double getVolume() {
        double volume = s*s*s;
        System.out.println("Volume kubus adalah : "+volume);
        return 0;
    }

    @Override
    public double getLuas() {
        double luas = 6*s*s;
        System.out.println("Luas kubus adalah : "+luas);
        return 0;
    }
    
}
