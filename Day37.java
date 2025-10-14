package day1;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.print("masukan Nilai :");
        int ma = g.nextInt();
        if(ma % 2 == 0){
            System.out.println(ma+" genap");
        }else{
            System.out.println(ma+" ganjil");
        }
    }
}
