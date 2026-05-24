package Pokusy;

public class Switch5 {
    public static void main(String[] args) {
        switch (80) {
            case 100:
                System.out.println("80");
                break;
            case 90:
                System.out.println("90");
                break;
            case 80:
                System.out.println("80");

            default://pokud místo braak se napíše default, tak to se vypíše hledaný case + příkaz pod default
                System.out.println("Žádná shoda");
        }
    }
}

