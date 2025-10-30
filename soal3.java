package tetapsemangat;
import java.util.Scanner;

public class g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gaji = 4500000;
        double potongan = 0;
        double bonus = 0;

        System.out.print("Masukkan jumlah keterlambatan: ");
        int terlambat = in.nextInt();
        if (terlambat > 5) {
            potongan = 10000 * terlambat;
        }
        if (terlambat == 0) {
            bonus = 200000;
        }
        double gajiKotor = gaji - potongan + bonus;
        double pajak = 0.05 * gajiKotor;
        double gajiBersih = gajiKotor - pajak;
        System.out.println("=== Data Gaji ===");
        System.out.println("Potongan     : Rp " + potongan);
        System.out.println("Bonus        : Rp " + bonus);
        System.out.println("Gaji Kotor   : Rp " + gajiKotor);
        System.out.println("Pajak (5%)   : Rp " + pajak);
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);
    }
}
