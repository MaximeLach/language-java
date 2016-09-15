/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class FonctionExposant {
 public static void main(String[] args) throws IOException {
        String nombre = ConsoleUtil.lireText("Veuillez saisir un nombre : ");
        String exposant = ConsoleUtil.lireText("Veuillez saisir une puissance : ");
        int resultat = MathUtil.exposant(Integer.valueOf(nombre),Integer.valueOf(exposant));
        System.out.println(nombre + " à la puissance " + exposant + " vaut : " + resultat);
    }   
}
