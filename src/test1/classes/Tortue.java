/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
public class Tortue extends Reptile {

    @Override
    public void manger() {
       System.out.println("Je mache");
    }

    @Override
    public void bouger() {
        System.out.println("Je marche");
    }

    @Override
    public void sleep() {
        System.out.println("Je dors");
    }
    
}
