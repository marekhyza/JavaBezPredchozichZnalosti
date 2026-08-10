package KapitolaDevet;

public class trectiCviceni9 {
    public static void main(String[] args) {
        try {
            int a[] = new int[3];
            a[0] = 10;
            a[1] = 0;
            a[2] = a[0] / a[1];
            System.out.println("Výsledek: " + a[2]);
        } catch (ArithmeticException v) {
            System.out.println("Chyba: " + v);
        } catch (ArrayIndexOutOfBoundsException v) {
            System.out.println("Chyba: " + v);
        } finally {
            System.out.println("Byl proveden koncový blok finally.");
        }
    }
}



