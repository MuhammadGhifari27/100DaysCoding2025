package soal1;

import java.util.Scanner;

public class tes45 {
    public static void main(String[] args) {
        Scanner g = new Scanner (System.in);
        System.out.println("tes akademi:");
        int m = g.nextInt();
        System.out.println("tes psikologi:");
        int a = g.nextInt();
        System.out.println("wawancara:");
        int y = g.nextInt();
        g.nextLine();
        System.out.println("status ekonomi:");
        String f = g.nextLine();
        
        if (m == 75 || a == 75 || y ==75 && f == "tinggi"){
            System.out.println("cadangkan");
        }else if (m >= 80 && a >= 80 && y >= 80){
            System.out.println("diterima langsung");
        }else if (m < 60 && a > 60 && y > 60){
            System.out.println("tidak lulus");
        }else if (m >= 70 || a >= 70 || y >= 70 && f == "rendah"){
            System.out.println("diterima dengan beasiswa");
        }else{
            System.out.println("ditolak");
        }
    }
}
