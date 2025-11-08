package day1;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        int jumlah = 0;
        Scanner g = new Scanner (System.in);
        System.out.println("Masukan nilai :");
        int f = g.nextInt();
        
        for (int i = 1; i <= f; i++) {
            jumlah += i ;
            if(i >= f){
                System.out.print(i+" = ");
            }else{
                System.out.print(i+" + ");
            }
        }
        System.out.println(jumlah);
    }
}
