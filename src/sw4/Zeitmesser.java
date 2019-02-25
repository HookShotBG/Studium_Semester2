package sw4;

import java.util.Scanner;

public class Zeitmesser {
    public static void main(String[] args) {
        long zeit = System.currentTimeMillis();
        System.out.println("Aktuelle Zeit: " + zeit);
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        long endzeit = System.currentTimeMillis();
        System.out.println("Runtime: " + (endzeit-zeit) + " ms");
    }
}
