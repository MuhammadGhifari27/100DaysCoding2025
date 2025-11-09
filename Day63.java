package day1;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("masukan nilai :");
        int m = g.nextInt();
        int jumlah = 1;
        
        for (int i = 1; i <= m; i++) {
            jumlah *= i;
            if(i >= m){
                System.out.print(i+" = ");
            }else{
                System.out.print(i+" x ");
            }
        }
        System.out.println(jumlah);
    }
}
