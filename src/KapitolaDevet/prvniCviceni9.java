package KapitolaDevet;

public class prvniCviceni9 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
        } catch (ArithmeticException v) {
            System.out.println("Chyba: " + v);
        }
    }

}
