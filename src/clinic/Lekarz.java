package clinic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lekarz extends Czlowiek{
    static List<Lekarz> lista_lekarzy = new ArrayList<>();
    private String specjalizacja;
    private String ID;

    public Lekarz(String imie, String nazwisko,String specjalizacja, DaneAdresowe adres) {
        super(imie,nazwisko,adres);
        this.specjalizacja=specjalizacja;
        this.ID = "L/"+String.valueOf(1+new Random().nextInt(99999));
        lista_lekarzy.add(this);
    }

    public String getID() {
        return ID;
    }


    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "Lekarz{" +
                "specjalizacja='" + specjalizacja + '\'' +
                ", ID='" + ID + '\'' +
                "} " + super.toString();
    }
}
