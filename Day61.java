package day1;
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = input.nextInt();

        System.out.print("Masukkan M (kelipatan): ");
        int M = input.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + ":");

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
