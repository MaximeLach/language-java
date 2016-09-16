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
public class ArrayListMixte {
    public static void main(String[] args) {
        
        //Création liste
        ArrayList liste1 = new ArrayList<>();
        liste1.add('A');
        liste1.add("B");
        liste1.add(1);
        liste1.add(true);
        liste1.add("Coucou");
        liste1.add(4);
        liste1.add(5);
        liste1.add(6);
        
        //Création liste à supprimer
        ArrayList<Integer> listeASupprimer = new ArrayList<>();
        for (int indice = 0; indice < 10; indice++) {
            listeASupprimer.add(indice);
        }
        
        //Affichage avant modification
        System.out.println("liste 1 : " + liste1);
        System.out.println("Liste à supprimer : " + listeASupprimer);
        
        //Opération sur la liste1
        liste1.removeAll(listeASupprimer);
                
        //Affichage après modification
        System.out.println("liste 1 : " + liste1);
        System.out.println("Liste à supprimer : " + listeASupprimer);
    }
    
}
