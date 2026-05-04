package KapitolaSedm.StatickeInicializacniTridy;

class VychoziHodnoty {
    static int minimalniHodnoceni = 70;
}

public class StatickeInicializacniTridy {
    public static void main(String[] args) {
        System.out.println("Hodnota pro úspěšné složení testu je: "
                + VychoziHodnoty.minimalniHodnoceni);
    }
}

