package Controller;

import java.util.ArrayList;

import Model.*;

public class MainController {

    public static double hitungBiaya(double berat, double jarakTempuh) {
        double total = 0;

        if (berat > 5) {
            total = berat * 1500;
        }
        total += jarakTempuh * 7500 + 5000;

        return total;
    }

    public static double hitungBiaya(double berat, double jarakTempuh, boolean setuju) {
        // asumsi class bisnis harus membayar harga parasut juga
        double total = 0;

        if (berat > 5) {
            total = berat * 2500;
        }

        total += jarakTempuh * 10000 + 5000;

        if (setuju) {
            total += total * 0.1;
        }

        return total;
    }

    public static double hitungBiaya(double jarakTempuh, boolean setuju) {
        // asumsi class bisnis harus membayar harga parasut juga
        double total = jarakTempuh * 15000 + 5000;

        if (setuju) {
            total += total * 0.1;
        }

        return total;
    }

    public static JenisTiket getTipe(int num) {

        if (num == 1) {
            return JenisTiket.EKONOMI;
        } else if (num == 2) {
            return JenisTiket.BISNIS;
        }
        return JenisTiket.FIRSTCLASS;

    }

    public static double getTotal(ArrayList<Tiket> listTiket) {

        double total = 0;

        for (Tiket tiket : listTiket) {

            total += tiket.getharga();

        }

        return total;

    }
}
