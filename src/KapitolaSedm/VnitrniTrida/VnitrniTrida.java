package KapitolaSedm.VnitrniTrida;

public class VnitrniTrida {
    public static void main(String[] args) {
        Vnejsi vnejsi = new Vnejsi();
        vnejsi.zobrazit();
    }
}

class Vnejsi {
    int student = 1234;

    void zobrazit() {
        Vnitrni vnitrni = this.new Vnitrni();
        vnitrni.tisk();
    }

    class Vnitrni {
        void tisk() {
            System.out.print("Ahoj Student " + student);
        }
    }
}

