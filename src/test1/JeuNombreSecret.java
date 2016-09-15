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
public class JeuNombreSecret {

    public static void main(String[] args) throws IOException {
        System.out.println("**** Jeu du nombre secret ****");
        int min = Integer.valueOf(ConsoleUtil.lireText(
                    "Veuillez saisir le nombre min : "));
        int max = Integer.valueOf(ConsoleUtil.lireText(
                    "Veuillez saisir le nombre max : "));
        int nombreSecret = MathUtil.genereNombreAleatoire(min, max);
        
        int nombreEssai = 0;
        int proposition;

        do {
            proposition = Integer.valueOf(ConsoleUtil.lireText(
                    "Veuillez saisir un nombre entre " + min + " et "+ max + " : "));
            if (proposition > nombreSecret) {
                System.out.println("Trop Grand!!!");
            } else {
                System.out.println("Trop petit!!!");
            }
            nombreEssai++;
        } while (proposition != nombreSecret);

        System.out.println("\nNombre d'essai(s) : " + nombreEssai);
        if (nombreEssai < 3) {
            System.out.println("Génial");
        } else if (nombreEssai < 6) {
            System.out.println("Super!");
        } else if (nombreEssai < 9) {
            System.out.println("Cool!");
        } else if (nombreEssai < 12) {
            System.out.println("Pas mal!");
        } else {
            System.out.println("Nul!");
        }
    }
}
