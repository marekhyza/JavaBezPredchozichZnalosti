package KapitolaSest;

public class Polyforfismus {
   public static void main(String[] args) {
       zobrazitChybu();
       zobrazitChybu("V tiskárně došel papír");
   }
   static void zobrazitChybu(){
       System.out.println("V programu došlo k chybě");

    }
    static void zobrazitChybu(String chybovaZprava){
        {
            System.out.println(chybovaZprava);

        }
    }
}
