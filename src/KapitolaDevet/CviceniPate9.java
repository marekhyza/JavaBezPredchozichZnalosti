package KapitolaDevet;

public class CviceniPate9 {

    public static void main(String[] args) {

        mojeMetoda();
    }

    public static void mojeMetoda() {
        int a = 10, b = 0, c;

        try {

            c = a / b;

            System.out.println(c);
        } catch (ArithmeticException vyjimka) {
            System.out.println("Nulou nelze dělit: " + vyjimka);
        }
    }
}