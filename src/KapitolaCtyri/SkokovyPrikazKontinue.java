package KapitolaCtyri;

public class SkokovyPrikazKontinue {
    public static void main(String[] args) {
        int x = 0;
        while (x < 5)
        {
            System.out.println("Před příkazem continue x = " + x);
            x++;
            if (x == 4)
                continue;
            System.out.println("Po příkazu x continue x =" + x);
        }
    }
}

