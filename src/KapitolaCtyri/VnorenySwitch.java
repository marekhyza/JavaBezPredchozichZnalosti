package KapitolaCtyri;

public class VnorenySwitch {
    public static void main(String[] args){
        char a = 'B';
        switch (90){
            case 100:
                System.out.println(100);
                break;
            case 90:
                switch (a){
                    case 'A':
                        System.out.println("A");
                        break;
                    case 'B':
                        System.out.println("B");
                        break;
                }
                break;

            case 80:
                System.out.println("80");
                break;
            default:
                System.out.println("Žádná shoda");
        }
    }
}