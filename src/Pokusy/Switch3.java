package Pokusy;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("zadej číslo dne v týdnu");
        int den = sc.nextInt();
        switch (den) {
            case 1:
                System.out.println("Pondělí");
                break;

            case 2:
                System.out.println("úterý");
                break;
            case 3:
                System.out.println("středa");
                break;
            case 4:
                System.out.println("čtvrtek");
                break;
            case 5:
                System.out.println("pátek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("neděle");
                break;

        }
    }
}
