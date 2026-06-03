package KapitolaOsm;

public class ViceurovnovaDedicnost {
    public static void main(String[] args) {
        PostgradualniStudent3 ps1 = new PostgradualniStudent3();
        ps1.zobrazit();

    }
}

class Osubka {


    protected String jmeno;
    protected int vek;

    Osubka() {
        jmeno = "Jan Koukal";

    }

    protected void zobrazitJmeno() {
        System.out.println("Jmeno studenta: " + jmeno);
    }
    protected void zobrazitVek() {
        System.out.println("Vek studenta: " + vek);
    }

}

class Student3 extends Osubka {
    protected int IDStudenta;

    Student3() {
        IDStudenta = 12345;
    }

    protected void zobrazitIDStudenta() {
        System.out.println("Identifikace studenta: " + IDStudenta);
    }
}

class PostgradualniStudent3 extends Student3{


    public void zobrazit() {
        zobrazitJmeno();
        zobrazitIDStudenta();
    }
}
