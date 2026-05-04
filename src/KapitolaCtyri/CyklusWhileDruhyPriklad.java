package KapitolaCtyri;

public class CyklusWhileDruhyPriklad {
    public static void main(String[] args) {
        int x = 0;
        while (true)
        {
            System.out.println("aktuální hodnota x je: " + x);
            x++;
            if (x ==5)
                break;
        }
    }
}