package day1;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("masukan halaman :");
        int h = g.nextInt();
        switch (h){
            case 1:
                System.out.println("aku");
                break;
            default:
                System.out.println("bukan saya");
                break;
        }
    }
}
