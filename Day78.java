package day1;
import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        System.out.println("\n=== HASIL ===");
        System.out.println("Panjang kalimat : " + kalimat.length());
        System.out.println("Uppercase       : " + kalimat.toUpperCase());
        System.out.println("Lowercase       : " + kalimat.toLowerCase());
        System.out.println("Trim            : [" + kalimat.trim() + "]");
        System.out.println("Contains 'a'    : " + kalimat.contains("a"));
        System.out.println("Substring(0,3)  : " + kalimat.substring(0, 3));
        System.out.println("Replace a->@    : " + kalimat.replace("a", "@"));
    }
}
