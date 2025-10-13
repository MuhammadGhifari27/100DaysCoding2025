package day1;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner m = new Scanner (System.in);
        System.out.print("masukan nilai:");
        int nilai = m.nextInt();

        if (nilai >= 80) {
            if (nilai >= 90) {
                System.out.println("Nilai Anda A");
            } else {
                System.out.println("Nilai Anda B");
            }
        } else {
            System.out.println("Nilai Anda C");
        }
    }
}
