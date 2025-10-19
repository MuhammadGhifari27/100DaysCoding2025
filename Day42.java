package day1;
import java.util.Scanner;

public class HitungGajiTanpaFinal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        double PAJAK_PERSEN = 12.5;
        System.out.print("Masukkan Gaji Pokok (Rp): ");
        double gajiPokok = scan.nextDouble();
      
        double potongan = gajiPokok * (PAJAK_PERSEN / 100);      
        double gajiBersih = gajiPokok - potongan;

        System.out.println("×××××××××××××");
        System.out.println("Pajak yang dikenakan: " + PAJAK_PERSEN + "%");
        System.out.println("Potongan Pajak: Rp " + potongan);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}
