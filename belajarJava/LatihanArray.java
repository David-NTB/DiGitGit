import java.util.*;

class LatihanArray{
    public static void main(String[] args){
        //Buat array
        int[] array1 = {0,1,2,3,4};
        int[] array2 = {9,8,7,6,5};
        

        //Menu awal
        System.out.println("\n==============================");
        System.out.println("LATIHAN NGOTAK-ATIK ARRAY");
        System.out.println("==============================\n");

        //Tampilan array awal
        System.out.println("==============================");
        System.out.print("array1 -> ");
        printArray(array1);
        System.out.print("array2 -> ");
        printArray(array2);
        System.out.println("==============================\n");
                
        //Tugas 1 = Sort array kebalik;
        System.out.println("==============================");
        System.out.print("array1 -> [");
        for(int i=4; i>=0; i--){
            System.out.print(array1[i] + ", ");
        }
        System.out.print("]\narray2 -> [");
        for(int i=4; i>=0; i--){
            System.out.print(array1[i] + ", ");
        }
        System.out.println("]\n==============================\n");
        
        //Tugas 2 = Operasi tambah antara dua buah array;
        System.out.println("==============================");
        System.out.print("array 3 -> ");
        operasiArray(array1, array2);
        System.out.println("==============================\n");

        //Tugas 3 = Menggabungkan dua buah array;
        System.out.println("==============================");
        System.out.print("array 4 -> ");
        gabungArray(array1, array2);
        System.out.println("==============================\n");
    }
    private static void printArray(int[] printIni){
        System.out.println(Arrays.toString(printIni));
    }
    private static void operasiArray(int[] ar1, int[] ar2){
        int[] array3 = new int[5];
        for(int i=0; i<5; i++){
            array3[i] = ar1[i] + ar2[i];
        }
        printArray(array3);
    }
    private static void gabungArray(int[] ar1, int[] ar2){
        int[] array4 = new int[10];
        for(int i=0; i<5; i++){
            array4[i] = ar1[i];
        }
        Arrays.sort(ar2);
        for(int i=0; i<5; i++){
            array4[i+5] = ar2[i];
        }
        printArray(array4);
    }
}
    //Sebenarnya ada cara yang lebih simple, cuma kemarin gak kepikiran
    //Jadi ya... ini aja sih. Yang penting mikir sendiri