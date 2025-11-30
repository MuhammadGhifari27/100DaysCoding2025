package day1;

import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] angka = new int[n];
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
            total += angka[i]; 
        }

        System.out.println("Total jumlah elemen array = " + total);
    }
}
