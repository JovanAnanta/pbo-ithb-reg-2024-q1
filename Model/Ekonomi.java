package Model;

public class Ekonomi extends Tiket {
    private double berat;

    public Ekonomi(double jarak, JenisTiket tiket, double berat) {
        super(jarak, tiket);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

}
