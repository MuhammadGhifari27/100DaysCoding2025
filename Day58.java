package day1;
import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
