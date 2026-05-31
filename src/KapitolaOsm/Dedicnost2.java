package KapitolaOsm;

public class Dedicnost2 {
    public static void main(String[] args) {
        PostgradualniStudent2 ps = new PostgradualniStudent2();
        ps.zobrazit();
    }
}

class Student2 {
    private int IDStudenta;

    Student2() {
        IDStudenta = 123456;
    }

    Student2(int ID) {
        IDStudenta = ID;
    }

    protected void zobrazit() {
        System.out.println("Identifikace studenta: " + IDStudenta);
    }
}

class PostgradualniStudent2 extends Student2 {
    PostgradualniStudent2() {
        super(5555);
    }

    public void zobrazit() {
        super.zobrazit();
    }
}
