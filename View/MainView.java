package View;

import java.util.Scanner;
import Main.*;
import Controller.*;
import Model.*;

public class MainView {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean lanjut = true;

        while (lanjut) {

            System.out.println("1. EKONOMI\n2. Bisnis\n3. First Class");
            System.out.print("Masukkan jenis tiket : ");
            int tipeTiket = Integer.parseInt(scan.nextLine());

            System.out.print("Masukkan jarak tempuh : ");
            int jarakTempuh = Integer.parseInt(scan.nextLine());

            if (tipeTiket == 1) {
                Main.listTiket.add(menuTiketEkonomi(MainController.getTipe(tipeTiket), jarakTempuh));
            } else if (tipeTiket == 2) {
                Main.listTiket.add(menuTiketBisnis(MainController.getTipe(tipeTiket), jarakTempuh));
            } else {
                Main.listTiket.add(menuTiketFirstClass(MainController.getTipe(tipeTiket), jarakTempuh));
            }
            print();

            System.out.println("\n\nlagi?");
            lanjut = Boolean.parseBoolean(scan.nextLine());
        }

    }

    public static Tiket menuTiketEkonomi(JenisTiket tipeTiket, double jarakTempuh) {
        System.out.println("berat : ");
        int berat = Integer.parseInt(scan.nextLine());

        Tiket tiket = new Ekonomi(jarakTempuh, tipeTiket, berat);
        tiket.setharga(MainController.hitungBiaya(berat, jarakTempuh));

        return tiket;
    }

    public static Tiket menuTiketBisnis(JenisTiket tipeTiket, double jarakTempuh) {
        System.out.println("berat : ");
        int berat = Integer.parseInt(scan.nextLine());

        System.out.println("nambah biaya makan?(true/false)");
        boolean setuju = Boolean.parseBoolean(scan.nextLine());

        Tiket tiket = new Bisnis(jarakTempuh, tipeTiket, berat, setuju);
        tiket.setharga(MainController.hitungBiaya(berat, jarakTempuh, setuju));

        return tiket;
    }

    public static Tiket menuTiketFirstClass(JenisTiket tipeTiket, double jarakTempuh) {
        System.out.println("Ambil biaya asuransi perjalanan?(true/false)");
        boolean setuju = Boolean.parseBoolean(scan.nextLine());

        Tiket tiket = new FirstClass(jarakTempuh, tipeTiket, setuju);
        tiket.setharga(MainController.hitungBiaya(jarakTempuh, setuju));

        return tiket;
    }

    public static void print() {
        for (int i = 0; i < Main.listTiket.size(); i++) {
            System.out.println("============================");
            System.out.println("Tiket " + i + 1);
            System.out.println(Main.listTiket.get(i));
            System.out.println("============================");
        }

        System.out.print("\ntotal biaya : " + MainController.getTotal(Main.listTiket));

    }
}
