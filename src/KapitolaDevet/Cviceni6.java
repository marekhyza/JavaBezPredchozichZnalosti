package KapitolaDevet;

public class Cviceni6 {

    public static void main(String[] args) {
        try {
            try {
                int a[] = new int[3];
                a[0] = 10;
                a[1] = 0;
                a[2] = a[1] / a[3];
            } catch (ArithmeticException vyjimka) {
                System.out.println("Chyba: " + vyjimka);
            }
        } catch (ArrayIndexOutOfBoundsException vyjimka) {
            System.out.println("Chyba: " + vyjimka);
        }
    }
}


