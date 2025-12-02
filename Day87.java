package day1;
public class Day87 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};

        int cari = 30; 
        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break; 
            }
        }

        if (ditemukan) {
            System.out.println(cari + " ditemukan di dalam array.");
        } else {
            System.out.println(cari + " tidak ditemukan di dalam array.");
        }
    }
}
