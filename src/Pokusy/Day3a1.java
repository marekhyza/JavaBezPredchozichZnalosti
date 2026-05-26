package Pokusy;

import java.util.Scanner;


public class Day3a1 {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);

    int secret = 3;

    boolean running = true;

 while(running)    {


    System.out.println("Zadej cislo:");
    int guess = scanner.nextInt();

 if(guess ==secret)    {
        System.out.println("Uhodl jsi!");
        running = false;
    } else if(guess >secret)

    {
        System.out.println("Moc vysoko");
    } else

    {
        System.out.println("Moc nizko");
    }

}

}
        }