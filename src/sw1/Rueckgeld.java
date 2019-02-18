/**
 * Author: Daniel Lutziger
 * Class: WIN TZ HS 18b
 * Date: 18.02.2019
 */

package sw1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Rueckgeld {

    public static void main(String[] args) {
        int preis = 105; // Preis des Produkts in Rappen
        double bezahlt = betragEingabe();; // Eingeworfener Betrag in Rappen
        double rueckgeld = bezahlt-preis;

        //Ausgabe
        System.out.println("Preis : " + preis + " Rappen");
        System.out.println("Bezahlt : " + bezahlt);

        //falls nicht genügend geld eingeworfen wurde
        if(rueckgeld>=0)
            System.out.println("Rueckgeld : " + rueckgeld);
        else
            System.out.println("Bruh, not enough money inserted");
    }

    /**
     * Methode um herauszufinden, welcher Betrag eingeworfen wurde
     * @return eingeworfener Betrag in Rappen
     */
    public static double betragEingabe(){
        //währungen welche eingeworfen werden können
        Vector<Integer> waehrungen = new Vector<>();
        waehrungen = initWaehrungen();
        //modulo operator -> % 13/2 = 6 rest 1
        Vector<Integer> muenzEingabe = new Vector<>();
        int betragRappen = 0;
        for(int i=0;i<waehrungen.size();i++){
            System.out.print((double)waehrungen.elementAt(i)/100 + " Fr Stücke: ");
            Scanner scan = new Scanner(System.in);
            int eingabe = scan.nextInt();
            betragRappen += waehrungen.elementAt(i)*eingabe;
            muenzEingabe.add(eingabe);
        }
        return betragRappen;
    }

    /**
     * Variable währung mittels Rappenwerten initialisieren -> einfach Wert hinzufügens
     * @return initialisierter Vector
     */
    public static Vector<Integer> initWaehrungen() {
        Vector<Integer> vector = new Vector<>();
        vector.add(500);
        vector.add(200);
        vector.add(100);
        vector.add(50);
        vector.add(20);
        vector.add(10);
        vector.add(5);
        return vector;
    }

}
