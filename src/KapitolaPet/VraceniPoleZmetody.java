package KapitolaPet;

public class VraceniPoleZmetody {
    public static void main(String[] args) {
        float vysledekTestu[];
        vysledekTestu = dataTestu();
        System.out.println("Správné odpovědi :" + vysledekTestu[0]);
        System.out.println("Celkem otázek: " + vysledekTestu[1]);
    }
        static float[] dataTestu()

        {
            float vysledekTestu[] = {70,100};
            return vysledekTestu;
        }

    }