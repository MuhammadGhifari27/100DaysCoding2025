package day1;

import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("masukan tinggi :");
        int tinggi = g.nextInt();
        
        System.out.println("Membuat Pola Vertikal dengan Tinggi " + tinggi + " Baris:");
        
        for (int i = 0; i < tinggi; i++){
            System.out.println("*"); 
        }
    }
}
