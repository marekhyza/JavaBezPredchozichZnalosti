import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jednoduchá kalkulačka. Napište 'konec' nebo 'exit' pro ukončení.");

        while (true) {
            System.out.print("Zadejte první číslo: ");
            String s = sc.next();
            if (s.equalsIgnoreCase("konec") || s.equalsIgnoreCase("exit")) break;

            double a;
            try {
                a = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Neplatné číslo.");
                continue;
            }

            System.out.print("Zadejte operaci (+ - * /): ");
            String op = sc.next();
            if (op.equalsIgnoreCase("konec") || op.equalsIgnoreCase("exit")) break;

            System.out.print("Zadejte druhé číslo: ");
            String t = sc.next();
            if (t.equalsIgnoreCase("konec") || t.equalsIgnoreCase("exit")) break;

            double b;
            try {
                b = Double.parseDouble(t);
            } catch (NumberFormatException e) {
                System.out.println("Neplatné číslo.");
                continue;
            }

            double result;
            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Chyba: dělení nulou.");
                        continue;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Neznámá operace: " + op);
                    continue;
            }

            System.out.println("Výsledek: " + result);
        }

        System.out.println("Konec programu. Nashledanou!");
        sc.close();
    }
}
