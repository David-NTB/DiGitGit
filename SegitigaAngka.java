import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String args[]){
        
        //Panggil scanner
        Scanner input = new Scanner(System.in);

        //Menu awal
        int a;
        System.out.println("==============================");
        System.out.print("Masukkan ukuran segitiga: ");
        a = input.nextInt();
        System.out.println("==============================");

        //Fungsi segitiga 1
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }

        System.out.println("==============================");

        //Fungsi segitiga 2
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        System.out.println("==============================");

        //Fungsi segitiga 3
        int k = 1;
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" " + k);
                k++;
            }
            System.out.println(" ");
        }

        //Tutup scanner
        input.close();
    }
    
}
