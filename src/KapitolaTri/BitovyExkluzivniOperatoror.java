package KapitolaTri;

public class BitovyExkluzivniOperatoror {
    public static void main(String[] args) {
        int a = 15, b = 10, c;
        c = (a ^ b);
        System.out.println(" a ^ b  = " + c);

    }

    public static class VnejsiBlok {
       public static void main(String[] args) {
            int znamka = 0;
            if (znamka ==0)
            {

                System.out.println(znamka);
             //   int x = 0;
            }

           // System.out.println(x); // hodi to chybu protoze x je uvnitr bloku dát pryč komentáře před System a Int x = 0

        }
    }
}