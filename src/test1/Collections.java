/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Collections {

    public static void main(String[] args) {
//        ArrayList<String> liste = new ArrayList();
//        liste.add("Coucou");
//        liste.add("Hello");
//         liste.add("Coucou");
//         
//        for (String s : liste) {
//            System.out.println(s);
//        }
//        System.out.println(liste + " " + liste.size());
//        System.out.println("Coucou : "+ liste.indexOf("Coucou"));
//        
//        liste.remove("Coucou");
//        System.out.println(liste + " " + liste.size());
//        System.out.println("Coucou : "+ liste.indexOf("Coucou"));
        
        //Céation de la 1ère liste
        ArrayList<Integer> liste1 = new ArrayList();
        for (int indice = 10; indice <= 100; indice = indice + 10) {
            liste1.add(indice);
        }

        //Céation de la 2ème liste
        ArrayList<Integer> liste2 = new ArrayList();
        for (int indice = 2; indice <= 100; indice = indice + 2) {
            liste2.add(indice);
        }

        //Céation de la 3ème liste
        ArrayList<Integer> liste3 = new ArrayList();
        for (int indice = 3; indice <= 99; indice = indice + 3) {
            liste3.add(indice);
        }

        //Opération sur les listes
        liste2.removeAll(liste1);
        liste2.removeAll(liste3);

        //Affihage de la liste 2
        System.out.println(liste2);
        System.out.println("Nombre : " + liste2.size());
    }
}
