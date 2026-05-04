package KapitolaTri;

public class DalsiInkreDekre {
    public static void main(String[] args) {
        int a = 5, b = 0;
        System.out.println("Počáteční hodnota: a = " + a +", b = " + b);
        b = a++;
        System.out.println("b = a++ hodnota: a = " + a + " b = " +b );
        b = a--;
        System.out.println("b = a-- hodnota: a =  " + a + " b = " + b);
        b = --a;
        System.out.println("b = --a hodnota: a " + a + " b = " + b);
        b = ++a;
        System.out.println("b = ++a hodnota: a " + a + " b = " + b);
    }
}
