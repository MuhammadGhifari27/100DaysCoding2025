import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama   : ");
        String nama = sc.nextLine();          

        System.out.print("Masukkan umur   : ");
        int umur = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan alamat : ");
        String alamat = sc.nextLine();

        System.out.print("Masukkan email  : ");
        String email = sc.nextLine();

        System.out.println("BIODATA SAYA");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Email  : " + email);
    }
                           }
