package fr.afpa.module;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TP02 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar(2022, Calendar.FEBRUARY, 1);
        int premierjourdumois = gc.get(GregorianCalendar.DAY_OF_WEEK);
        System.out.println("L  Ma Me J  V  S  D");
        switch (premierjourdumois) {
            case GregorianCalendar.TUESDAY:
                System.out.print(" ");
                break;
            case GregorianCalendar.WEDNESDAY:
                System.out.print("   ");
                break;
            case GregorianCalendar.THURSDAY:
                System.out.print("     ");
                break;
            case GregorianCalendar.FRIDAY:
                System.out.print("       ");
                break;
            case GregorianCalendar.SATURDAY:
                System.out.print("         ");
                break;
            case GregorianCalendar.SUNDAY:
                System.out.print("           ");
                break;
        }
        int nbreDeJour = gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        for (int i = 1; i <= nbreDeJour; i++) {
            System.out.format("%02d ", i);
            gc.add(GregorianCalendar.DAY_OF_MONTH, 1);
            if (gc.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.MONDAY) {
                System.out.println();
            }
        }
    }
}
