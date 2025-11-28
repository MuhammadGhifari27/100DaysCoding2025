package day1;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("masukan berapa array:");
        int f = g.nextInt();
        int []angka=new int[f];
        
        for (int i = 0; i < angka.length; i++) {
            System.out.println("masukan nilai:");
            angka[i]=g.nextInt();
        }
        
        
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
}
