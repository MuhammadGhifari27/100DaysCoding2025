package day1;
import java.util.Scanner;
public class Day100 {

    static int[] B;
    static int n;
    static int retas(int[] arr) {
        n = arr.length;
        B = new int[n];

         for (int i = 0; i < n; i++) {
            B[i] = -1;
        }

        int p = 0; 

        for (int x : arr) {
            int idx = x % n;

            while (B[idx] != -1) {
                idx = (idx + 1) % n;
                p++;
            }

            B[idx] = x;
        }

        return p;
    }  
    static String susunKode(int p) {
        StringBuilder gabung = new StringBuilder();

        
        for (int x : B) {
            gabung.append(x);
        }       
     if (p > gabung.length()) {
            p = gabung.length();
            
        }    
        return gabung.substring(0, p);
    }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            
            arr[i] = input.nextInt();
        }
        
        int p = retas(arr);
         String kode = susunKode(p);
        System.out.println(kode);
    }
}
