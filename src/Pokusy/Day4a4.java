package Pokusy;

import java.util.Scanner;

public class Day4a4 {
    public static void main(String[] args) {

        String[] jmena = {"Marek", "Petr", "Terezka", "Ivana", "Berynka"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej jméno ke kontrole: ");
        String hledaneJmeno = sc.nextLine();

        boolean nalezeno = false;
        for (int i = 0; i < jmena.length; i++) {
            if (jmena[i].equalsIgnoreCase(hledaneJmeno)) {
                nalezeno = true;
                System.out.println("Nalezeno");
                break;
            } else {
                System.out.println("Nenalezeno");
            }

        }
    }
}

