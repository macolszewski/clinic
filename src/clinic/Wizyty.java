package clinic;


import java.util.LinkedList;
import java.util.Queue;

public class Wizyty {
    private String ID;
    static Queue<Wizyty> kolejka_wizyt = new LinkedList<>();

    Wizyty(String pacjent, String lekarz) {
        String temp_id = pacjent;
        temp_id=temp_id.concat(";");
        temp_id=temp_id.concat(lekarz);
        this.ID=temp_id;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Wizyty{" +
                "ID='" + ID + '\'' +
                '}';
    }
}
