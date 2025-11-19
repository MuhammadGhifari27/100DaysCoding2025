package day1;
import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        int angka;
        while (true) {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
            if (angka < 0) {
                break; 
            }
            jumlah += angka;
        }
        System.out.println("Total jumlah = " + jumlah);
    }
}
