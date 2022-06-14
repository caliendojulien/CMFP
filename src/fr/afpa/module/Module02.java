package fr.afpa.module;

import java.util.GregorianCalendar;
import java.util.Random;

public class Module02 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar(2022, 5,1);
        System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("Lundi Mardi Mercredi Jeudi Vendredi Samedi Dimanche");
    }
}
