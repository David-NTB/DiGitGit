import java.util.*;

class BilanganFibonacci {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        b = 0;
        c = 1;
        d = 0;

        //menu awal
        System.out.println("==============================");
        System.out.println("BILANGAN FIBONACCI");
        System.out.println("==============================");

        //input
        System.out.print("Masukkan jumlah bilangan fibonacci: ");
        a = input.nextInt();

        //proses
        System.out.print(b + ", " + c + ", ");
        for(int i = 1; i <= a - 2; i++){
            d = b+c;
            System.out.print(d + ", ");
            b = c;
            c = d;
        }

        input.close();
    }
}