package sw3;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
    public static void main(String[] args) {
        Random rn = new Random();
        int zahl = rn.nextInt(101);
        System.out.println("Guess the number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int input;
        int versuche = 0;
        do {
            input = scan.nextInt();
            if(input < zahl) {
                System.out.println("Number too small");
            } else if (input > zahl){
                System.out.println("Number too big");
            }
            versuche++;
        }while(input != zahl);
        System.out.println("Yeeeeeah buddy !! You got it after " + versuche + " tries");
    }
}
