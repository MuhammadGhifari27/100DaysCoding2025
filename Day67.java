package day1;

import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("masukan nilai :");
        int m = g.nextInt();

        System.out.println("pola Horizontal dengan panjang "+m);
        for (int i = 1; i <= m; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
