package Pokusy;


public class Day3a2 {
    public static void main(String[] args) {
        int a = 5;

        for (int i = 0; i < 10; i++) {

            System.out.println("vypiš číslo " + ++a);
            if (a % 2 == 0)
                System.out.println("číslo je sude");
            else
                System.out.println("číslo je liché");

        }

    }


}
