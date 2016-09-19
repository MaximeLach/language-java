/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Animal;
import test1.classes.Poisson;
import test1.classes.Serpent;

/**
 *
 * @author admin
 */
public class AnimalTest {
    
    @Test
    public void test(){
        Poisson p = new Poisson();
        p.manger();
        p.bouger();
        Animal s = new Serpent();
        s.manger();
        s.bouger();
    }
}
