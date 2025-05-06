package exe_1;

public class Esercizio1 {

    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 != 0) {
            return false;
        } else if (anno % 100 == 0 && anno % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String test = "ciao";
        System.out.println("La stringa \"" + test + "\" ha lunghezza pari? " + stringaPariDispari(test));

        int anno = 2024;
        System.out.println("L'anno " + anno + " è bisestile? " + annoBisestile(anno));
    }
}
