package KapitolaPet;
import java.util.*;
public class MetodaFillZmenaHodnot {
   public static void main(String[] args) {
       float idStudenta[] = new float[350];
       Arrays.fill(idStudenta, 1);
       for (int i = 0; i < idStudenta.length; i++)
           System.out.println(idStudenta[i]);
       Arrays.fill(idStudenta, 200, 301, 0);
       for (int i = 0; i < idStudenta.length; i++)
           System.out.println(idStudenta[i]);
    }
}
