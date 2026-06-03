package KapitolaOsm;

public class PretizeniClenskychMetod {
    public static void main(String[] args) {
        PostgradualniStudent ps = new PostgradualniStudent();
        ps.zobrazit();

    }
}

class Osoba {
    protected String jmeno;

    Osoba() {
        jmeno = "Jan Petrik";
    }

    void zobrazit() {
        System.out.println("Trida osoba: " + jmeno);
    }

}

class Student extends Osoba {
    protected int IDStudenta;

    Student() {
        IDStudenta = 12345;
    }

    void zobrazit() {
        System.out.println("Trida student: " + IDStudenta);
    }
}

class PostgradualniStudent extends Student {


void zobrazit() {
    System.out.println("Trida postgradualni student: " + IDStudenta);
    System.out.println("Trida postgradualni student: " + jmeno);
    System.out.println("Trida postgradualni student: " + IDStudenta);

}

}