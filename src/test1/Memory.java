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
public class Memory {

    public static void main(String[] args) throws IOException {
        int ligne;
        int colonne;
        int nombreCase;
        int[] caseChoisie1 = new int[2];
        int[] caseChoisie2 = new int[2];
        
        //Création du tableau
        do {
            nombreCase = ConsoleUtil.lireEntier(
                    "Veuillez saisir un nombre de cases de côtés(paires de 2 à 6) : ");
            if (nombreCase < 2 | nombreCase > 6 | nombreCase % 2 != 0) {
                System.out.println("Veuillez recommencer !!!");
            }
        } while (nombreCase < 2 | nombreCase > 6 | nombreCase % 2 != 0);
        char[][] tab = new char[nombreCase][nombreCase];
        boolean[][] tabEtat = new boolean[nombreCase][nombreCase];

        //Initialisation des tableaux
        for (int indiceX = 0; indiceX < tab.length; indiceX++) {
            for (int indiceY = 0; indiceY < tab.length; indiceY++) {
                tab[indiceX][indiceY] = ' ';
                tabEtat[indiceX][indiceY] = false;
            }
        }

        //Remplissage tableau
        for (int lettre = 65; lettre < 65 + nombreCase * nombreCase / 2; lettre++) {
            for (int nombreLettre = 1; nombreLettre <= 2; nombreLettre++) {
                do {
                    ligne = MathUtil.genereNombreAleatoire(0, tab[0].length - 1);
                    colonne = MathUtil.genereNombreAleatoire(0, tab[0].length - 1);
                } while (verifierCase(tab, ligne, colonne) == true);
                tab[ligne][colonne] = (char) lettre;
            }

        }
        
        do{
            afficherTableau(tab, tabEtat);
        
           do{
               System.out.println("1ère case :");
                caseChoisie1 = saisirCase(tab.length);
                if( tabEtat[caseChoisie1[0]][caseChoisie1[1]] == true)
                    System.out.println("Case déjà retournée !!!");
            }while(tabEtat[caseChoisie1[0]][caseChoisie1[1]] == true);
                tabEtat[caseChoisie1[0]][caseChoisie1[1]] = true;
           
            afficherTableau(tab,tabEtat);
        
            do{
            System.out.println("2ème case :");
            caseChoisie2 = saisirCase(tab.length);
            if( tabEtat[caseChoisie2[0]][caseChoisie2[1]] == true)
                System.out.println("Case déjà retournée !!!");
            }while(tabEtat[caseChoisie2[0]][caseChoisie2[1]] == true);
                tabEtat[caseChoisie2[0]][caseChoisie2[1]] = true;
            
            afficherTableau(tab,tabEtat);
    
            if(tab[caseChoisie1[0]][caseChoisie1[1]] == tab[caseChoisie2[0]][caseChoisie2[1]]){
                System.out.println("Bien joué! !!!\n");
            } else {
                System.out.println("Essaye encore !!!\n");
                tabEtat[caseChoisie1[0]][caseChoisie1[1]] = false;
                tabEtat[caseChoisie2[0]][caseChoisie2[1]] = false;
            }
        }while(partieGagnee(tabEtat) == false);
                
    }

    
/////////////////////////////////// Fontions /////////////////////////////////// 
    public static boolean partieGagnee(boolean tabEtat[][]) {
        return false;
    }
    
    public static int [] saisirCase(int tailleTableau) throws IOException {
        int[] caseChoisie = new int[2];
        int ligne;
        int colonne;
        do {
            ligne = ConsoleUtil.lireEntier("Veuillez saisir la ligne : ") - 1;
            if (ligne < 0 | ligne > tailleTableau-1) {
                System.out.println("Ligne inexistante !!!");
            }
        } while (ligne < 0 | ligne > tailleTableau-1);
                
        do {
            colonne = ConsoleUtil.lireEntier("Veuillez saisir la colonne : ") - 1;
            if (colonne < 0 | colonne > tailleTableau-1) {
                System.out.println("Colonne inexistante !!!");
            }
        } while (colonne < 0 | colonne > tailleTableau-1);
        caseChoisie[0] = ligne;
        caseChoisie[1] = colonne;
                
        return caseChoisie;  
    }
    
    public static boolean verifierCase(char tab[][], int ligne, int colonne) {
        if (tab[ligne][colonne] == ' ') {
            return false;
        } else {
            return true;
        }
    }

    public static void afficherTableau(char tab[][], boolean tabEtat[][]) {
        System.out.print("**** Memory ****\n-");
        for (int nombreCase = 0; nombreCase < tab.length + tab.length; nombreCase++) {
            System.out.print("-");
        }
        for (int indiceX = 0; indiceX < tab[0].length; indiceX++) {
            System.out.print("\n");
            System.out.print("|");
            for (int indiceY = 0; indiceY < tab.length; indiceY++) {
                if (tabEtat[indiceX][indiceY] == true) {
                    System.out.print(tab[indiceX][indiceY] + "|");
                } else {
                    System.out.print(" |");
                }
            }
        }
        System.out.print("\n-");
        for (int nombreCase = 0; nombreCase < tab.length + tab.length; nombreCase++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }
}
