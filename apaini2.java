package tetapsemangat;
import java.util.Scanner;


public class ss {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("nilai a : ");
        int a = i.nextInt();
        System.out.println("nilai b : ");
        int b = i.nextInt();
        int c;
        if(a >= b){
          c =  a+b;
          if(c%3==0){
              for (int j = c; j >= 1; j--) {
                  for (int k = j; k < c; k++) {
                       System.out.print("*");
                  }
                  System.out.println();
              }
          }else{
              System.out.println(c);
          }
        }else if(a <= b){
            c = a*b;
            if(c%2==0){
                for (int j = 1; j <= c; j++) {
                    for (int k = 1; k <= c; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }else{
                System.out.println(c);
            }
        }
    }
    
}
