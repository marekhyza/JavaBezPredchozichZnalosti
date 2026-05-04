package KapitolaSedm;

public class PretizeniKonstrukotru {
public static void main(String[] args) {
    mojeTrida7 x = new mojeTrida7();
    mojeTrida7 y = new mojeTrida7(354);
    x.tisk();
    y.tisk();
    }
}
class mojeTrida7 {
    int student;

    mojeTrida7() {
        student = 0;
    }

    mojeTrida7(int ID) {
        student = ID;
    }

    public void tisk() {
        System.out.println("Ahoj " + student);
    }
}