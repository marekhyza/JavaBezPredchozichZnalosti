package KapitolaOsm.AbstraktniTridy.Osoba;

public class OsobaAbstraktni {

    public static void main(String[] args) {

        Student s = new Student();
        s.zobrazit();
        s.pozdrav();

    }

    static abstract class Osoba {

        protected String jmeno;

        Osoba() {
            jmeno = "Jan Koukal";
        }

        abstract void pozdrav();
    }


    static class Student extends Osoba {

        protected int IDStudenta;

        Student() {
            IDStudenta = 12345;
        }

        @Override
        void pozdrav() {
            System.out.println("Ahoj, jsem student");
        }

        void zobrazit() {
            System.out.println("Třída student: " + IDStudenta);
            System.out.println("Jméno: " + jmeno);
        }
    }
}
