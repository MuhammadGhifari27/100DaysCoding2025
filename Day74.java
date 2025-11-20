package day1;
import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Halo");
            System.out.println("2. Cetak Angka 1–5");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo!\n");
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("\n");
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }

        } while (pilihan != 0);
    }
}
