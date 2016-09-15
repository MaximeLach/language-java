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
public class FonctionFactorielle {
    public static void main(String[] args) throws IOException {
        String nombre = ConsoleUtil.lireText("Veuillez saisir un nombre : ");
        int resultat = MathUtil.factorielle(Integer.valueOf(nombre));
        int resultatRecursif = MathUtil.factorielleRecursive(Integer.valueOf(nombre));
        System.out.println("Factorielle de " + nombre + " vaut : " + resultat);
        System.out.println("Factorielle récursive de " + nombre + " vaut : " + resultatRecursif);
    }   
}
