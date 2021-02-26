/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author Pepita Neysa
 */
public class Lingkaran extends AbstractShape {

    double r = 6;
    double phi = 3.14;

    @Override
    void getLuas() {
        double Luas = phi * r * r;
        System.out.println("Luas lingkaran adalah : " + Luas);
    }

    @Override
    void getKeliling() {
        double Keliling = 2 * phi * r;
        System.out.println("Keliling lingkaran adalah : " + Keliling);
    }

}
