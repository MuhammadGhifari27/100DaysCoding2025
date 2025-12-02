package day1;
public class Day86 {
    public static void main(String[] args) {
        int[] angka = {12, 5, 9, 20, 3, 15};
        int min = angka[0]; 

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka minimal adalah: " + min);
    }
}
