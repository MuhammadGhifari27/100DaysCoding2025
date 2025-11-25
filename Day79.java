package day1;
import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Buat username: ");
        String userBaru = input.nextLine();

        System.out.print("Buat password: ");
        String passBaru = input.nextLine();

        System.out.println("\nAkun berhasil dibuat!\n");
        
        String userLogin, passLogin;

        while (true) {
            System.out.print("Username: ");
            userLogin = input.nextLine();

            System.out.print("Password: ");
            passLogin = input.nextLine();
            if (userLogin.equals(userBaru) && passLogin.equals(passBaru)) {
                System.out.println("Login Berhasil! Selamat datang.");
                break; 
            } else {
                System.out.println("Username atau Password salah! Coba lagi.\n");
            }
        }
    }
}
