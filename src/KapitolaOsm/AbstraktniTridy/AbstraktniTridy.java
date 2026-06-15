package KapitolaOsm.AbstraktniTridy;

public class AbstraktniTridy {
    public static void main(String[] args) {
        Student s = new Student();
        PostgradualniStudent ps = new PostgradualniStudent();
        s.zobrazit();
        ps.zobrazit();
    }

}

abstract class Osoba {
    abstract void zobrazit();
}


class Student extends Osoba {
    protected int IDStudenta;

    Student() {
        IDStudenta = 12345;
    }

    void zobrazit() {

        System.out.println("Trida student" + IDStudenta);
    }
}

class PostgradualniStudent extends Student {
    void zobrazit() {
        System.out.println("Trida postgradualni student:" );
        System.out.println("Identifikace studenta: " + IDStudenta);
    }


}
