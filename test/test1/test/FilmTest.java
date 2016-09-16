/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the etemplate in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Film;

/**
 *
 * @author admin
 */
public class FilmTest {
    
    @Test
    public void test1(){
    Film f1 = new Film();
    
    f1.setTitre("Pulp Fiction");
  
   
    System.out.println(f1);
    }
}
