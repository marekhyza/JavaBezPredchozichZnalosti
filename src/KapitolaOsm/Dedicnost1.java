package KapitolaOsm;

class Dedicnost1 {
    public static void main(String[] args) {
        PostgradualniStudent ps = new PostgradualniStudent();
        ps.zobrazit();
    }

}

class Student {
    private int IDStudenta;

    Student() {
        IDStudenta = 12345;
    }

    protected void zobrazit() {
        System.out.println("Identifikace studenta: " + IDStudenta);
    }
}

class PostgradualniStudent extends Student {
    private int cisloPrace;
    PostgradualniStudent() {
        super();
        cisloPrace = 1225;

        System.out.println("Cislo prace: " + cisloPrace);
    }

}

