package KapitolaDevet;

public class druheCviceni9 {
    public static void main(String[] args) {
        try {
            int a[] = new int[3];
            a[0] = 10;
            a[1] = 20;
            a[2] = a[0] / a[3];
        } catch (ArithmeticException v) {
            System.out.println("Chyba: " + v);
        } catch (ArrayIndexOutOfBoundsException v) {
            System.out.println("Chyba: " + v);

        }


    }
}



