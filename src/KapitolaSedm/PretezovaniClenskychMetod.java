package KapitolaSedm;

public class PretezovaniClenskychMetod {
    public static void main(String[] args) {
        mojeTrida5 x = new mojeTrida5();
        x.tisk();
        x.tisk("Marku");

    }
}
class mojeTrida5{
    public void tisk() {
        System.out.println("Ahoj");
    }
    public void tisk(String str){
        System.out.println("Ahoj " + str + ".");
    }
}
