import java.util.Scanner;

public class FungsiPerpangkatan {

    //Fungsi perpangkatan
    public static int pangkat(int a, int b){
        int hasil = 1;
        for(int i = 1; i <= b; i++){
            hasil *= a;
        }
        return hasil;
    }

    public static void main(String args[]){

        //Panggil Scanner
        Scanner input = new Scanner(System.in);

        //Buat variabel
        int a, b;

        //Menu Awal
        System.out.println("\nSistem Perpangkatan");
        System.out.println("==============================");

        //Input data
        System.out.print("Bilangan: ");
        a = input.nextInt();

        System.out.print("Pangkat: ");
        b = input.nextInt();

        //Tutup scanner
        System.out.print("Hasil : " + pangkat(a, b));

        input.close();        
    }
}
