package day1;
import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks pertama: ");
        String t1 = input.nextLine();

        System.out.print("Masukkan teks kedua: ");
        String t2 = input.nextLine();

        System.out.println("\n=== HASIL PENGECEKAN ===");
        System.out.println("equals()          : " + t1.equals(t2));
        System.out.println("equalsIgnoreCase(): " + t1.equalsIgnoreCase(t2));
        System.out.println("contains()        : " + t1.contains(t2));
        System.out.println("isEmpty() t1      : " + t1.isEmpty());
        System.out.println("isEmpty() t2      : " + t2.isEmpty());
    }
}
