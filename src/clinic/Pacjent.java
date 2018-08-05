package clinic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pacjent extends Czlowiek{
    static List<Pacjent> listaPacjentow = new ArrayList<>();
    private String ID;


    public Pacjent(String imie, String nazwisko, DaneAdresowe adres) {
        super(imie, nazwisko, adres);
        this.ID = "P/"+String.valueOf(1+new Random().nextInt(99999));
        listaPacjentow.add(this);
    }


    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "ID='" + ID + '\'' +
                "} " + super.toString();
    }
}
