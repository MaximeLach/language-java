/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

/**
 *
 * @author admin
 */
public class MathUtil {

    public static int genereNombreAleatoire() {
        int nombre;
        do {
            nombre = (int) (Math.random() * 100 + 1);
        } while (nombre > 100);
        return nombre;
    }

    public static int genereNombreAleatoire(int min, int max) {
        if (min >= max) {
            throw new RuntimeException("Erreur mathématique");
        }
        

        int nombre;
        do {
            nombre = (int) (Math.random() * (max+1));
        } while (nombre < min || nombre > max);
        return nombre;
    }

    public static int carre(int entier) {
        return entier * entier;
    }

    public static int exposant(int nombre, int puissance) {
        int resultat = nombre;
        if (puissance <= 0) {
            return 1;
        }
        for (int i = 1; i < puissance; i++) {
            resultat = resultat * nombre;
        }
        return resultat;
    }

    public static int factorielle(int nombre) {
        int resultat = 1;
        if (nombre < 0) {
            throw new RuntimeException("Erreur mathématique");
        }
//        if (nombre == 0) {
//            return 1;
//        }

        for (int i = 1; i <= nombre; i++) {
            resultat = resultat * i;
        }
        return resultat;
    }

    public static int factorielleRecursive(int nombre) {
        int resultat;
        if (nombre < 0) {
            throw new RuntimeException("Erreur mathématique");
        }
        if (nombre == 0) {
            return 1;
        }
        return resultat = factorielleRecursive(nombre - 1) * nombre;

    }
}
