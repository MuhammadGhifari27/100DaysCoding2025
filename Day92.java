package day1;
public class Day92 {
    static String cekAngka(int x) {
        if (x > 0) {
            return "Angka positif"; 
        }
        if (x < 0) {
            return "Angka negatif"; 
        }
        return "Angka nol"; 
    }
    public static void main(String[] args) {
        System.out.println(cekAngka(5));
        System.out.println(cekAngka(-3));
        System.out.println(cekAngka(0));
    }
}
