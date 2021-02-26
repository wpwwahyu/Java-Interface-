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
public class Persegi extends AbstractShape{
    double s = 6;
    
    @Override
    void getLuas() {
        double Luas = s*s;
        System.out.println("Luas persegi adalah : "+Luas);
    }

    @Override
    void getKeliling() {
        double Keliling = s*4;
        System.out.println("Keliling persegi adalah : "+Keliling);
    }
    
}
