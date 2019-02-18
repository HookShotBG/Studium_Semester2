package sw2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxBerechnung {

    public static void main(String[] args) { Scanner keyScan = new Scanner(System.in);
        System.out.println("Wie viele Zahlen wollen Sie eingeben...?");
        int anzahl = keyScan.nextInt();
        int[] inputs = new int[anzahl];
        for (int i=0; i<inputs.length; i++){
            inputs[i] = keyScan.nextInt();
        }
        Arrays.sort(inputs);

        System.out.println("Die grösste eingegebene Zahl ist "+ inputs[inputs.length-1]);
    }
}
