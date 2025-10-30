package day1;
public class Day53 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Angka: " + i);
            if (i == 5) {
                System.out.println("Berhenti di angka 5");
                break; 
            }
            i++;
        }
    }
}
