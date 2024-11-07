package Model;

public class FirstClass extends Tiket {
    private boolean asuransi;

    public FirstClass(double jarak, JenisTiket tiket, boolean asuransi) {
        super(jarak, tiket);
        this.asuransi = asuransi;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

}
