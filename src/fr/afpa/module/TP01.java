package fr.afpa.module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
            char[] motAlendroit = motAleatoire();
        System.err.println(motAlendroit);
        char[] motAlenvers = melange(motAlendroit);
        // J'affiche le mot a l'envers a l'utilisateur
        System.out.println(motAlenvers);
        // Je récupère la saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ta proposition : ");
        String saisieUtilisateur = scanner.nextLine();
        // Je vérifie si la saisie est le mot a l'endroit.
        char[] saisie = saisieUtilisateur.toCharArray();
        if (Arrays.equals(saisie, motAlendroit)) {
            System.out.println("Bravo");
        } else {
            System.out.println("Nul");
        }
    }

    /**
     * Une méthode qui tire un mot au hasard
     *
     */
    public static char[] motAleatoire() {
        Random r = new Random();
        int nbre = r.nextInt(22506);
        char[] mot = {};
        try {
            FileInputStream fichier = new FileInputStream("./dictionnaire.txt");
            Scanner scan = new Scanner(fichier);
            for (int i = 0; i < nbre; i++) {
                scan.nextLine();
            }
            mot = scan.nextLine().toLowerCase().toCharArray();
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé");
        }
        return mot;
    }

    public static char[] melange(char[] motAmelanger) {
        char[] copie = new char[motAmelanger.length];
        for (int i = 0; i < motAmelanger.length; i++) {
            copie[i] = motAmelanger[i];
        }
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            int r1 = r.nextInt(copie.length);
            int r2 = r.nextInt(copie.length);
            char temporaire = copie[r1];
            copie[r1] = copie[r2];
            copie[r2] = temporaire;
        }
        return copie;
    }
}