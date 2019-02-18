package sw3;

import java.util.Random;
import java.util.Scanner;

public class Randnum {
    public static void main(String[] args) {
        int rep = 1;
        do{
        System.out.println("Denk an eine Zahl zwischen 0 und 99 und dann drück Enter");
        System.out.println("drück 1 für Richtig, 2 für zu gross, 3 zu klein");
        //press anykey to continue
        try{        System.in.read();}catch(Exception e){	e.printStackTrace();}
        int input = 0;
        int versuche = 0;
        int pcnum = new Random().nextInt(100);
        int highestNumber = 100;
        int lowestNumber = 0;
        while(input!= 1) {
            System.out.println("Ist es die "+ pcnum);
            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();
            versuche++;
            if(input == 2){
                if(highestNumber>pcnum)
                    highestNumber = pcnum;
                pcnum = (int) Math.floor(Math.random() * highestNumber) + lowestNumber;
            } else if (input==3){
                if (lowestNumber<pcnum)
                    lowestNumber = pcnum;
                pcnum = (int) Math.floor(Math.random() * highestNumber) + lowestNumber;
            }
        }

        System.out.println("Yeeeeeah buddy !! Your PC got it after " + versuche + " tries");
        System.out.println("Wanna play again boi? 1 yes; 2 nah");
        rep = new Scanner(System.in).nextInt();
    }while(rep==1);
    }
}
