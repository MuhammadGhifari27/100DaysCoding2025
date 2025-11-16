package day1;

import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("masukan lebar :");
        int m = g.nextInt();
        System.out.println("masukan panjang :");
        int y = g.nextInt();
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
