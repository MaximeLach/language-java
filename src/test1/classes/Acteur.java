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
   public class Acteur {
    private String nom;
    private String prenom;
    private static long nombre;

    public Acteur() {
        nombre++;
    }

    public Acteur(String nom, String prenom) {
        this();
        this.nom = nom;
        this.prenom = prenom;
    }

    public static long getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nom + " " + prenom; //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
