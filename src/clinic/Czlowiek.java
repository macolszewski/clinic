package clinic;

public abstract class Czlowiek {
    private String imie;
    private String nazwisko;
    private DaneAdresowe adres;

    public Czlowiek(){

    }

    public  Czlowiek(String imie, String nazwisko, DaneAdresowe adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public DaneAdresowe getAdres() {
        return adres;
    }

    public void setAdres(DaneAdresowe adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Czlowiek{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres=" + adres +
                '}';
    }
}
