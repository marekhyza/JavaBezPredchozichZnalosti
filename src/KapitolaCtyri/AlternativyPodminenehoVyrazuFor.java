package KapitolaCtyri;

public class AlternativyPodminenehoVyrazuFor {
    public static void main(String[] args) {
        boolean y = true;
        for (int x = 0; y; x++){
            System.out.println("aktuální hodnota x je: " + x++);
            System.out.println("aktuální hodnota y je: " + y);
            if (x == 5)
                y = false;


        }
    }
}