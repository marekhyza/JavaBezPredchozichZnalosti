package Pokusy;

public class Switch2 {
    public static void main(String arg[]) {
        switch (80){
            case 100:
                System.out.println(100);
                break;
            case 80:
                System.out.println("80");//zde se vynechal break
            case 90:
                System.out.println(90);
                break;
        }
    }
}
