public class Day21 {
   
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("");
        System.out.println("sudah ditukar");
        System.out.println("nilai a :"+a);
        System.out.println("nilai b :"+b);
    }
}
