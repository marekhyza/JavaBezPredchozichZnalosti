package KapitolaOsm.DynamickeOdbaveniMetody;

public class DynamickeOdbaveniMetody {
    public static void main(String[] args) {
    Osoba test;
    Osoba o = new Osoba();
    Student s = new Student();
    PostgradualniStudent ps = new PostgradualniStudent();
    test = o;
    test.zobrazit();
    test = s;
    test.zobrazit();
    test = ps;
    test.zobrazit();

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
    Student (){
        IDStudenta = 12345;
    }
    void zobrazit() {
        System.out.println("Trida student: " + IDStudenta);
    }
}
class PostgradualniStudent extends Student {
    void zobrazit() {
        System.out.println("Trida postgradualni student: ");
        System.out.println("Trida postgradualni student: " + jmeno);
        System.out.println("Trida postgradualni student: " + IDStudenta);
    }
}
