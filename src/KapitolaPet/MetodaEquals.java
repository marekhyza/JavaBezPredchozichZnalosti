package KapitolaPet;

import java.util.*;
public class MetodaEquals {
    public static void main(String[] args) {
        int student1Hodnoceni[] = new int[3];
        student1Hodnoceni[0] = 90;
        student1Hodnoceni[1] = 80;
        student1Hodnoceni[2] = 70;

        int student2Hodnoceni[] = new int[3] ;
        student2Hodnoceni[0] = 90;
        student2Hodnoceni[1] = 80;
        student2Hodnoceni[2] = 70;
        if (Arrays.equals(student1Hodnoceni, student2Hodnoceni)) {
            System.out.println("Stejné");
        }else{
            System.out.println("Různé");
            }

    }

}
