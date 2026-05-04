package KapitolaSest;

public class SeznamArgumentu {
   public static void main(String[] args) {
        float a;
        int b = 70, c = 100;
        a = vypocetHodnoceni (b,c);
        System.out.println("Hodnoceni testu je: " + a);
    }
    static float vypocetHodnoceni(int spravneOdpovedi, int pocetOtazekTestu)
    {
        return (spravneOdpovedi / pocetOtazekTestu) * 100;
    }
}
