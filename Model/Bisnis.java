package Model;

public class Bisnis extends Tiket {
    private double berat;
    private boolean afirmasi;

    public Bisnis(double jarak, JenisTiket tiket, double berat, boolean afirmasi) {
        super(jarak, tiket);
        this.berat = berat;
        this.afirmasi = afirmasi;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public boolean isAfirmasi() {
        return afirmasi;
    }

    public void setAfirmasi(boolean afirmasi) {
        this.afirmasi = afirmasi;
    }
}
