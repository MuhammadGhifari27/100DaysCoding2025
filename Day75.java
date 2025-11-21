package day1;
import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        System.out.println("Panjang teks       : " + teks.length());
        System.out.println("Huruf besar        : " + teks.toUpperCase());
        System.out.println("Huruf kecil        : " + teks.toLowerCase());
    }
}
