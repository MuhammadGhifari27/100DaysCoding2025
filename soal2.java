package soal1;

import java.util.Scanner;

public class soal {
    public static void main(String[] args) {
        Scanner gyo = new Scanner (System.in);
        System.out.println("masukan nilai :");
            int g = gyo.nextInt();
            if(g%2==0){
                System.out.println(g+"genap");
            }else{
                System.out.println(g+"ganjil");
            }
        }
    }
