/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Gère l'interace clavier utilisateur
 * @author admin
 */
public class ConsoleUtil {

    public static String lireText(String message) throws IOException {
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.print(message);
        String texte = clavier.readLine();
        return texte;
    }
    public static int lireEntier(String message) throws IOException {
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.print(message);
        int entier = Integer.valueOf(clavier.readLine());
        return entier;
    }
    
}
