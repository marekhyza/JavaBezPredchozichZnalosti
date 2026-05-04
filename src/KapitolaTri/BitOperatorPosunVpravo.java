package KapitolaTri;

import java.io.IOException;

public class
BitOperatorPosunVpravo {
    public static void main(String[] args) {
        int a = -15, c = 0;
        c = a >> 1;
        System.out.println("a >> 1 ="  + c );


    }

    public static class ReadIn {
        public static void main(String[] args) throws IOException { // Přidáno throws

            System.out.print("Stiskni klávesu a Enter: ");

            // (char) převede číselný kód z klávesnice zpět na písmeno
            char volba = (char) System.in.read();

            System.out.println("Napsal jsi: " + volba);
        }



    }
}