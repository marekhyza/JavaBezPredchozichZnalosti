package KapitolaCtyri;

public class AlternativyPodminenehoVyrazuFor {
    public static void main(String[] args) {
        boolean y = true;
        for (int x = 0; y; x++)
        {
            System.out.println("Aktuální hodnodta x = " + x);
            if (x ==5)
                y  = false;

        }
    }
}