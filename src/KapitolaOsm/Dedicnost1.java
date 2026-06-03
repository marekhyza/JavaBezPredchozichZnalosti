package KapitolaOsm;

class Dedicnost1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.zobrazit();

    }
}

class Student {
    private int IDStudenta;
    private String jmeno;

    Student() {
        jmeno = "Jan Novak";
        IDStudenta = 12345;
    }
    protected String getJmeno() {
        return jmeno;
    }


    protected void zobrazit() {
        System.out.println("Jmeno studenta: " + jmeno);
        System.out.println("Identifikace studenta: " + IDStudenta);
    }
}



