package day1;

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("Masukan Nilai :");
        int m = g.nextInt();
        
        if (m >= 90){
            System.out.println(m+" dapat A");
        }else if(m < 90 && m >= 80){
            System.out.println(m+" dapat B");
        }else if (m < 80 && m >= 70){
            System.out.println(m+" dapat C");
        }else if (m < 70 && m >= 60){
            System.out.println(m+" dapat D");
        }else{
            System.out.println("Nilai anda E \"Eror\"");
        }
    }
}
