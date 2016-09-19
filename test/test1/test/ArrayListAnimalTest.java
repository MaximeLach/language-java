/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import test1.classes.Animal;
import test1.classes.Poisson;
import test1.classes.Serpent;
import test1.classes.Sleepable;
import test1.classes.Tortue;

/**
 *
 * @author admin
 */
public class ArrayListAnimalTest {
   @Test
    public void test(){
        List <Animal> listeAnimaux = new ArrayList<>();
        listeAnimaux.add(new Poisson());
        listeAnimaux.add(new Tortue());
        listeAnimaux.add(new Serpent());
        
        for(Animal elemAct : listeAnimaux){
            elemAct.manger();
            elemAct.bouger();
        }
    }  
    public void testSleepable(){
        Sleepable s = new Poisson();
    }
}
