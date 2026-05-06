package KapitolaTri;

public class TernarniOperator {
    public static void main(String[] args) {
        int hodnoceniSemestralnihoProjektu = 90;
        char hodnoceni = hodnoceniSemestralnihoProjektu >= 70 ? 'P' : 'N';
        System.out.println("Hodnoceni semestr: " + hodnoceni);
    }
}