package Model;

public abstract class Tiket {
    private double jarak;
    private JenisTiket tiket;
    private double harga;
    private double totalHarga;

    public Tiket(double jarak, JenisTiket tiket) {
        this.tiket = tiket;
        this.jarak = jarak;
    }

    public double getJarak() {
        return jarak;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }

    public JenisTiket getTiket() {
        return tiket;
    }

    public void setTiket(JenisTiket tiket) {
        this.tiket = tiket;
    }

    public double getharga() {
        return harga;
    }

    public void setharga(double harga) {
        this.harga = harga;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    @Override
    public String toString() {
        return "Nama Tiket: " + tiket + "\nJarak : " + jarak + "\nHarga: " + harga;
    }
}
