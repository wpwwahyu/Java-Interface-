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
public class Main{

    public static void main(String[] args){
        bangunRuang b1 = new kotakBalok();
        System.out.println("Balok : ");
        b1.getLuas();
        b1.getVolume();
        
        bangunRuang b2 = new persegiKubus();
        System.out.println("Kubus : ");
        b2.getLuas();
        b2.getVolume();
        
        bangunRuang b3 = new lingkaranBola();
        System.out.println("Bola : ");
        b3.getLuas();
        b3.getVolume();
    }
}
