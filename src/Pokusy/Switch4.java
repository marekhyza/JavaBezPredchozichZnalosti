package Pokusy;

public class Switch4 {
    public static void main(String[] args) {
        switch (70) {
            case 100:
                System.out.println("100");
                break;
            case 90:
                System.out.println("90");
                break;
            case 80:
                System.out.println("80");//program nenalezl shodu, default to ukončí na vypíše se žádná shoda
                break;
            default:
                System.out.println("Žádná shoda");


        }
    }

}
