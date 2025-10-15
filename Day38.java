package day1;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("masukan angka :");
        int m = g.nextInt();
        if(m < 0){
            System.out.println("negatif "+m);
        }else if (m == 0) {
            System.out.println("Nol "+m);
        }else{
            System.out.println("positif "+m);
        }
    }
}
