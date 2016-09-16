/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import test1.util.ConsoleUtil;

/**
 *
 * @author admin
 */
public class SetTest {
    public static void main(String[] args) throws IOException {
//        HashSet<String> set = new HashSet<>();
//        set.add("Thomas");
//        set.add("Digna");
//        set.add("Thomas");
//        System.out.println(set);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        
        Collection<Integer> liste = new ArrayList<>();
        for (int indice = 9; indice >0; indice--) {
            liste.add(indice);
        }
                
        System.out.println("\n///////////////");
        System.out.println("set : " + set);
        System.out.println("liste : " + liste);
        
        int choixTest = ConsoleUtil.lireEntier(
                    "\nTest 1 ou 2 ?");
            if (choixTest == 1) {
                set.addAll(liste);
                System.out.println("\n////// Ajout liste à set /////");
                System.out.println("set : " + set);
                System.out.println("liste : " + liste);
            }else{
                liste.addAll(set);
                System.out.println("\n///// Ajout set à liste /////");
                System.out.println("set : " + set);
                System.out.println("liste : " + liste);
            }
    }
}
