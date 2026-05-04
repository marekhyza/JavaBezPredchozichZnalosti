package KapitolaDve;

public class Poplatky {

    public static int celkemPoplateky;

    static {
        int poplatek1 = 50, poplatek2 = 100, poplatek3 = 50;
        celkemPoplateky = poplatek1 + poplatek2 + poplatek3;
    }

    public static void main(String[] args) {
        System.out.println("Celkové poplatky jsou: " + celkemPoplateky);
    }
}


