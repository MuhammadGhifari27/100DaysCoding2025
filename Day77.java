package day1;
import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kal = input.nextLine();

        System.out.println("\n=== HASIL MANIPULASI ===");
        System.out.println("substring(0, 5) : " + kal.substring(0, 5));
        System.out.println("replace()       : " + kal.replace("a", "@"));
        System.out.println("trim()          : " + kal.trim());
    }
}
