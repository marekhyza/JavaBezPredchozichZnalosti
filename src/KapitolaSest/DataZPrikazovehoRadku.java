package KapitolaSest;

public class DataZPrikazovehoRadku {
    public static void main(String[] arg) {
        if (arg.length >0)
            {
            for (int x = 0; x < arg.length; x++)
            {
                System.out.println(x +". argument příkazového řádku: " + arg[x]);
            }
            }
        else
        {
            System.out.println("Na příkazovém řádku nebyly specifikováný žádné argumenty ");

        }
    }
}
