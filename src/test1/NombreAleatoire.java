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
public class NombreAleatoire {
    public static void main(String[] args) throws IOException {
        int min = Integer.valueOf(ConsoleUtil.lireText(
                    "Veuillez saisir le nombre min : "));
        int max = Integer.valueOf(ConsoleUtil.lireText(
                    "Veuillez saisir le nombre max : "));
        int resultat = MathUtil.genereNombreAleatoire(min, max);
        System.out.println("Resultat : " + resultat);
    }
 
}
