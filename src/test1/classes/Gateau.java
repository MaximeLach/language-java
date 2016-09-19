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
public class Gateau {
    private static String forme = "Lune";
    private String gout;
    private String couleur;
    private static int nombre = 0;
    
    public Gateau() {
        nombre++;
    }
     public Gateau(String gout, String couleur) {
        this();
        this.gout = gout;
        this.couleur = couleur;
        
    }
    public static Integer getNombre() {
        return nombre;
    }

   

    @Override
    public String toString() {
        return "Forme : " + forme + "\nGout : " + gout + "\nGout : " + couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public static String getForme() {
        return forme;
    }

    public static void setForme(String forme) {
        Gateau.forme = forme;
    }

    public String getGout() {
        return gout;
    }

    public void setGout(String gout) {
        this.gout = gout;
    }
    
    
}
