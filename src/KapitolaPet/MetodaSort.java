package KapitolaPet;

import java.util.Arrays;

public class MetodaSort {
   public static void main(String[] args) {
       String mojePole[] = new String[4];
       mojePole[0] = "Marek";
       mojePole[1] = "Ivana";
       mojePole[2] = "Petr";
       mojePole[3] = "Tereza";
       Arrays.sort(mojePole); // tento prvek seřadí jména dle abecedy
       for (int i = 0; i < 4; i++)
           System.out.println(mojePole[i]);


    }
}
