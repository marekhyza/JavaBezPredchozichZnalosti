package KapitolaSest;

public class SignaturaMetody {
    public static void main(String[] args) {
        zobrazitChybu();
        zobrazitChybu("V tiskárně došel papír.");
        zobrazitChybu("ver3", 1);
        zobrazitChybu(1, "ver4");

    }
    static void zobrazitChybu()
    {
        System.out.println("V programu došlo k chybě");
    }
    static void zobrazitChybu(String chybovaZprava)
    {
        System.out.println(chybovaZprava);
    }
    static void zobrazitChybu(String chybovaZprava, int cisloChyby) {
        System.out.println("verze 3");
    }
    static void zobrazitChybu(int cisloChyby, String chybovaZprava)
        {
        System.out.println("verze 4");


    }
}
