package clinic;

public class DaneAdresowe {
    private String ulica;
    private String nr_domu;
    private String kod_pocztowy;
    private String miasto;

    public DaneAdresowe(String ulica, String nr_domu, String kod_pocztowy, String miasto) {
        this.ulica = ulica;
        this.nr_domu = nr_domu;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNr_domu() {
        return nr_domu;
    }

    public void setNr_domu(String nr_domu) {
        this.nr_domu = nr_domu;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "DaneAdresowe{" +
                "ulica='" + ulica + '\'' +
                ", nr_domu='" + nr_domu + '\'' +
                ", kod_pocztowy='" + kod_pocztowy + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
