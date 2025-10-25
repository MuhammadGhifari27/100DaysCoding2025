package day1;
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Angka 1: ");
        double a = in.nextDouble();

        System.out.print("Operator (+ - * /): ");
        char op = in.next().charAt(0);

        System.out.print("Angka 2: ");
        double b = in.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Hasil = " + (a + b));
                break;
            case '-':
                System.out.println("Hasil = " + (a - b));
                break;
            case '*':
                System.out.println("Hasil = " + (a * b));
                break;
            case '/':
                if (b != 0)
                System.out.println("Hasil = " + (a / b));
                else
                    System.out.println("b tidak bisa nol");
                break;
            default:
                System.out.println("Operator tidak dikenal");
        }
    }
}
