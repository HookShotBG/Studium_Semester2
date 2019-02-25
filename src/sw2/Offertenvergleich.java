/**
 * Author: Daniel Lutziger
 * Class: WIN TZ HS 18b
 * Date: 18.02.2019
 */

package sw2;

import java.util.Scanner;

public class Offertenvergleich {


    public Offertenvergleich(int zahl){
        System.out.println(zahl);
    }



    public static void main(String[] args) {
        double preisA; // Preis Lieferant A
        double preisB; // Preis Lieferant B
        int lZeitA; // Lieferzeit Lieferant A
        int lZeitB; // Lieferzeit Lieferant B

        Scanner eingabe = new Scanner(System.in);
        System.out.print("Preis A: ");
        preisA= eingabe.nextDouble();
        System.out.print("Preis B: ");
        preisB= eingabe.nextDouble();
        System.out.print("Lieferzeit A: ");
        lZeitA= eingabe.nextInt();
        System.out.print("Lieferzeit B: ");
        lZeitB= eingabe.nextInt();

        System.out.println("A: " + preisA + " CHF, " + lZeitA + " Tage");
        System.out.println("B: " + preisB + " CHF, " + lZeitB + " Tage");

        checkAlgorythm(lZeitA, lZeitB, preisA, preisB);

    }

    /**
     * Methode welche auswertet, welches Produkt gekauft werden soll
     *
     * Logik -> funktioniert so, dass die lieferzeit und der preis verglichen werden -> <=14 wochen -> dann preis
     *
     * @param time1 : lieferZeit des ersten Lieferanten
     * @param time2 : lieferZeit des zweiten Lieferanten
     * @param val1 : preis des ersten Lieferanten
     * @param val2 : preis des zweiten Lieferanten
     */
    public static void checkAlgorythm(int time1, int time2, double val1, double val2) {
        if(time1 <= 14 && time2 <=14){
            if(val1 == val2){
                System.out.println("Kein Unterscheid besteht");
            } else if(val1<val2){
                System.out.println("Produkt A bestellen: " + val1 + " CHF, " + time1  + "Tage");
            } else if(val2<val1) {
                System.out.println("Produkt A bestellen: " + val2+ " CHF, " + time2 + "Tage");
            } else System.out.println("Kein Produkt erwerben");
        } else if(time1 <= 14){
            System.out.println("Produkt A bestellen: " + val1 + " CHF, " + time1  + "Tage");
        } else if (time2 <= 14){
            System.out.println("Produkt A bestellen: " + val2+ " CHF, " + time2 + "Tage");
        } else {
            System.out.println("Kein Produkt erwerben");
        }
    }
}
