package sw2;

import java.util.Scanner;

public class Offertenvergleich {
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


        //wenn zeit kleiner 2 wochen A&B
            //wenn preis A kleiner B
            //wenn preis B kleiner A
            //wenn preis gleich

        if (lZeitA <=14 || lZeitB <= 14) {
            if(preisA < preisB && lZeitA<=14){
                System.out.println("Produkt A bestellen: " + preisA + " CHF, " + lZeitA + "Tage");
            } else if (preisA > preisB && lZeitA<=14 && lZeitB > 14){
                System.out.println("Produkt A bestellen: " + preisA + " CHF, " + lZeitA + "Tage");
            } else if (preisA == preisB && lZeitA<=14 && lZeitB <= 14){
                System.out.println("Kein Unterscheid besteht");
            } else if (preisA > preisB && lZeitA<=14 && lZeitB <= 14){

        } else {
            System.out.println("Kein Produkt erwerben");
        }

        /**
            if (lZeitA <=14 && lZeitB>14){
                System.out.println("Produkt A bestellen: " + preisA + " CHF, " + lZeitA + "Tage");
            } else if (lZeitB <=14 && lZeitA>14) {
                System.out.println("Produkt B bestellen: " + preisB + " CHF, " + lZeitB + "Tage");
            } else if (lZeitA < lZeitB && preisA < preisB) {
                System.out.println("Produkt A bestellen: " + preisA + " CHF, " + lZeitA + "Tage");
            } else if (lZeitA > lZeitB && preisA > preisB) {
                System.out.println("Produkt B bestellen: " + preisB + " CHF, " + lZeitB + "Tage");
            }



            else if (lZeitA<=14 && preisA<preisB){
                System.out.println("Produkt A bestellen: " + preisA + " CHF, " + lZeitA + "Tage");
            } else if(lZeitB <=14 && preisB<preisA) {
                System.out.println("Produkt B bestellen: " + preisB + " CHF, " + lZeitB + "Tage");
            } else if(lZeitB <=14 && preisB>preisA) {
                System.out.println("Produkt B bestellen: " + preisB + " CHF, " + lZeitB + "Tage");
            } else if(lZeitB <=14 && preisB<preisA) {
                System.out.println("Produkt B bestellen: " + preisB + " CHF, " + lZeitB + "Tage");
            } else if(lZeitB <=14 && preisB==preisA) {
                System.out.println("Produkt B bestellen: " + preisB + " CHF, " + lZeitB + "Tage");
            } else if(lZeitA <=14 && preisB==preisA) {
                System.out.println("Produkt A bestellen: " + preisA + " CHF, " + lZeitA + "Tage");
            } else if(lZeitB <=14 && preisB<preisA) {
                System.out.println("Produkt B bestellen: " + preisB + " CHF, " + lZeitB + "Tage");
            } else{
                System.out.println("Kein Unterscheid besteht");
            }
        }else {
            */

    }
}
