package KapitolaPet;

import java.util.*;

public class MetodaFill {
   public static void main(String[] args) {
       int idStudenta[] = new int[2000];
       Arrays.fill(idStudenta,0);
       for (int i = 0; i < idStudenta.length; i++)
           System.out.println(idStudenta[i]);
    }
}
