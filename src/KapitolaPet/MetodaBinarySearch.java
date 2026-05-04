package KapitolaPet;

import java.util.Arrays;

public class MetodaBinarySearch   {
    public static void main(String[] args) {

    int index;
    String mojePole[]= new String[4];
    mojePole [0] = "Marie";
    mojePole [1] = "Adam";
    mojePole [2] = "Vendulka";
    mojePole [3] = "Bohuš";
    Arrays.sort(mojePole);
    index = Arrays.binarySearch(mojePole, "Vendulka");
    System.out.println("Vendulka je po setřídění v prvku číslo:  " +index);

    }
}
