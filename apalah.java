package soal1;
import java.util.Scanner;

public class soallagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int N = sc.nextInt();

        for (int angka = 1; angka <= N; angka++) {
            boolean prima = true;

            if (angka < 2) prima = false;
            for (int i = 2; i < angka; i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (angka%3 == 0 && angka%5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (angka%3 == 0) {
                System.out.print("Fizz ");
            } else if (angka%5 == 0) {
                System.out.print("Buzz ");
            } else if (prima) {
                System.out.print("Prime ");
            } else {
                System.out.print(angka + " ");
            }
        }
    }
}
