package day1;
public class Day96 {
    static int tambah() {
        int a = 1;
        int b = 2;
        return a + b;
    }
    static int kurang(int a, int b) {
        return a - b;
    }
    static int kali(int a, int b) {
        return a * b;
    }
    static double bagi(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        int x = 20, y = 5;
        System.out.println("Hasil Tambah      : " + tambah());
        System.out.println("Hasil Kurang      : " + kurang(x, y));
        System.out.println("Hasil Kali        : " + kali(x, y));
        System.out.println("Hasil Bagi        : " + bagi(x, y));
    }
}
