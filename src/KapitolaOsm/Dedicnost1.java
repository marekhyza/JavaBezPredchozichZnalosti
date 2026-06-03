package KapitolaOsm;

class Dedicnost1 {
    public static void main(String[] args) {
        Studentik s = new Studentik();
        s.zobrazit();

    }
}

class Studentik {
    private int IDStudenta;
    private String jmeno;

    Studentik() {
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



