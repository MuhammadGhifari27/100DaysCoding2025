package day1;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.print("Masukan Nilai :");
        int M = g.nextInt();
        
        if (M % 3 == 0 && M % 5 == 0){
            System.out.println(M+" = Kelipatan 3&5");
        }else if (M % 3 == 0){
            System.out.println(M+" = Kelipatan 3");
        }else if (M % 5 == 0){
            System.out.println(M+" = Kelipatan 5");
        }else{
            System.out.println(M+" = Bukan kelipatan 3 atau 5");
        }
    }
          }
