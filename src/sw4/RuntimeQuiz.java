/**
 * Author: Daniel Lutziger
 * Class: WIN TZ HS 18b
 * Date: 25.02.2019
 */

package sw4;

import java.util.Random;
import java.util.Scanner;

public class RuntimeQuiz {
    public static void main(String[] args) {
        long zeit = System.currentTimeMillis();
        int [] antwort = {12,24,324, 21};
        String [] frage = new String[4];
        frage[0] = "Wie viel gibt 2*6?";
        frage[1] = "Wie viele Stunden hat ein Tag?";
        frage[2] = "Wie hoch ist der Eiffelturm?";
        frage[3] = "What's 9 + 10?";

        Random random = new Random();
        for (int i=0; i<antwort.length; i++) {
            int randomPosition = random.nextInt(antwort.length);
            int temp = antwort[i];
            String tmp = frage[i];
            antwort[i] = antwort[randomPosition];
            frage[i] = frage[randomPosition];
            antwort[randomPosition] = temp;
            frage[randomPosition] = tmp;
        }

        int richtig = 0;

        for(int i= 0; i<frage.length; i++){
            System.out.println(frage[i]);
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() == antwort[i]){
                System.out.println("Richtig");
                richtig++;
            }
            else {
                System.out.println("Falsch");
            }
        }
        printSummary(frage.length, richtig);
        long endzeit = System.currentTimeMillis();
        System.out.println("Runtime: " + (endzeit-zeit) + " ms");
    }

    static void printSummary(double total, double richtig) {
        if(richtig/total <= 0.33)
            System.out.println("Du hast noch Potential!");
        else if (richtig/total <= 0.66)
            System.out.println("Nicht schlecht!");
        else
            System.out.println("Super, gratuliere!");
        System.out.println("Richtig: "+richtig+" von "+total);
    }

}
