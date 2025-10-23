package day1;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        System.out.println("==Menu==");
        System.out.println("1. Donat ");
        System.out.println("2. Roti ");
        System.out.println("3. Minuman ");
        System.out.println("==========");
        
        System.out.print("masukan pesanan :");
        Scanner g = new Scanner (System.in);
        int m = g.nextInt();
        switch (m){
            case 1:
                System.out.println("saya memesan Donat");
                break;
            case 2:
                System.out.println("saya memesan Roti");
                break;
            case 3:
                System.out.println("saya memesan minuman");
                break;
            default :
                System.out.println("tidak ada di daftar menu");
                break;
        }
    }
}
