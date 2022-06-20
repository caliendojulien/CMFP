package fr.afpa.module6.tp6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Velo monVelo = new Velo(
                    "Decathlon",
                    "Speed 400",
                    LocalDate.now(),
                    null,
                    -5
            );
            System.out.println(monVelo);
        } catch (NbVitesseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Le programme ne s'arrete pas.");
        System.out.println("Le programme ne s'arrete pas.");
        System.out.println("Le programme ne s'arrete pas.");
        System.out.println("Le programme ne s'arrete pas.");
        System.out.println("Le programme ne s'arrete pas.");
        System.out.println("Le programme ne s'arrete pas.");
    }
}
