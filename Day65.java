package day1;
import java.util.Scanner;
public class Day65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        System.out.println("Faktorial dari " + n + " adalah " + faktorial);
    }
}
