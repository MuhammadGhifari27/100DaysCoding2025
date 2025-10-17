package day1;
import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Angka 1: ");
         double a = in.nextDouble();
        System.out.print("Operator (+ - * /): ");
       char op = in.next().charAt(0);
        System.out.print("Angka 2: ");
       double b = in.nextDouble();

        if (op == '+') System.out.println("Hasil: " + (a + b));
        else if (op == '-') System.out.println("Hasil: " + (a - b));
        else if (op == '*') System.out.println("Hasil: " + (a * b));
        else if (op == '/') System.out.println(b != 0 ? "Hasil: " + (a / b) : "Error");
        else System.out.println("Operator tidak valid!");

    }
}
