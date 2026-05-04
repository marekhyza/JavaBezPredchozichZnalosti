package KapitolaTri;

public class BitovyKomplementarniOperator {
    public static void main(String[] args) {
        int a = 15, c = 0;
        c = ~ a;
        System.out.println(" ~ a = " + c );

    }

    public static class RelacniOperatory {
        public static void main(String[] args) {
            int a = 5, b = 7;
            if (a >= b)
            {
                System.out.println(" a je větší nebo rovno b ");

            }
            else
        {
            System.out.println(" a není větší, nebo rovno b ");
        }


        }
    }

    public static class TernalniOperator {
        public static void main(String[] args) {
            int hodnoceniSemestralnihoProjektu = 90;
            char hodnoceni = hodnoceniSemestralnihoProjektu >=70 ? 'P' : 'N';
            System.out.println(" Hodnoceni semestr: " + hodnoceni);
        }
    }
}