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
public class Genre {
    private String nom;
    private static long nombre;

    public Genre() {
        nombre++;
    }

    @Override
    public String toString() {
        return nom; //To change body of generated methods, choose Tools | Templates.
    }

    public Genre(String nom) {
        this();
        this.nom = nom;
    }

    public static long getNombre() {
        return nombre;
    }
    

   
    
    
}
