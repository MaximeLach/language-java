/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the etemplate in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Acteur;
import test1.classes.Film;
import test1.classes.Genre;

/**
 *
 * @author admin
 */
public class FilmTest {
    
    @Test
    public void test1(){
    Film f1 = new Film("Pourquoi pas?",120,"blabla",1990,new Genre("Historique"),new Acteur("moi", "seulement"));
        System.out.println(f1);
   
    }
}
