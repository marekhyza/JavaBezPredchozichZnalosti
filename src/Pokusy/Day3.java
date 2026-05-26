package Pokusy;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secret = 5;

        for (int i = 1; i <= 3; i++) {//cyklus proběhne 3x a mám 3 pokusy

            System.out.println("Zadej cislo:");
            int cislo = sc.nextInt();

            if (cislo == secret) {
                System.out.println("Uhodl jsi!");
                break;
            } else if (cislo > secret) {
                System.out.println("Moc vysoko");
            } else {
                System.out.println("Moc nizko");
            }
        }
    }
}
