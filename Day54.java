package day1;
public class Day54 {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 10) {
            i++;
            if (i == 5) {
                continue; 
            }
            System.out.println("Angka: " + i);
        }
    }
}
