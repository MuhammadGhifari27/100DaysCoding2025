package gyomengulang;
public class te1 {
    public static void main(String[] args) {
        String Gyo [] = new String [6];
        Gyo [0] = "1";
        Gyo [1] = "4";
        Gyo [2] = "2";
        Gyo [3] = "5";
        Gyo [4] = "6";
        Gyo [5] = "2";
        String ghi = Gyo[5];
        for (int j = 5; j >= 0; j--) {
            if(j == 0){
                Gyo [j] = ghi;
            }else{
                Gyo [j] = Gyo [j-1];
            }         
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(Gyo[i]);
        }
    }
          }
