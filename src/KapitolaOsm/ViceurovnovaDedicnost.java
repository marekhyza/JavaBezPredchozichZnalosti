package KapitolaOsm;

public class ViceurovnovaDedicnost {
    public static void main(String[] args) {
        PostgradualniStudent3 ps1 = new PostgradualniStudent3();
        ps1.zobrazit();
    }
}

class Osoba {


    protected String jmeno;

    Osoba() {
        jmeno = "Jan Koukal";
    }

    protected void zobrazitJmeno() {
        System.out.println("Jmeno studenta: " + jmeno);
    }

}

class Student3 extends Osoba {
    protected int IDStudenta;

    Student3() {
        IDStudenta = 12345;
    }

    protected void zobrazitIDStudenta() {
        System.out.println("Identifikace studenta: " + IDStudenta);
    }
}

class PostgradualniStudent3 extends Student3 {


    public void zobrazit() {
        zobrazitJmeno();
        zobrazitIDStudenta();
    }
}
