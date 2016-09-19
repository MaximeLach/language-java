/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Gateau;

/**
 *
 * @author admin
 */
public class GateauTest {
    
    @Test
    public void test1(){
        
        Gateau g1 = new Gateau();
        Gateau g2 = new Gateau();
        Gateau g3 = new Gateau("chocolat", "rouge");
        
        
        
        g1.setForme("Rond");
        g1.setGout("Chocolat");
        g1.setCouleur("blanc");
        
        g2.setForme("Carré");
        g2.setGout("Chocolat");
        g2.setCouleur("noir");
        
        
        
        
        System.out.println(Gateau.getNombre());
        
    }
}
