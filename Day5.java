public class Day5 {
    public static void main(String[] args) {
        //1.byte
        //Ukuran: 8-bit
        //Rentang Nilai:-128 hingga 127
        byte umur = 30;
        //2.short
        //Ukuran: 16-bit
        //Rentang Nilai:-32,768 hingga 32,767
        short gajiperjam = 3000;
        //3.int
        //Ukuran:32-bit
        //Rentang Nilai:-2.1 miliar hingga 2.1 miliar
        int HargaMobil = 350000000;
        //4.long
        //Ukuran:64-bit
        //Rentang Nilai:sangat besar lebih dari 9 kuintiliun 
        long populasiDunia = 8100000000L;
        
        System.out.println("Umur :"+ umur +"(Hemat memori untuk angka Kecil)");
        System.out.println("Gaji Perjam :"+ gajiperjam +"(Untuk angka ribuan)");
        System.out.println("Harga mobil :"+ HargaMobil +"(Paling umum untuk Jutaan/miliar)");
        System.out.println("PopulasiManusia :"+ populasiDunia +"L(Untuk angka yang sangat besar)");
    }
 
}
