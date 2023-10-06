import java.util.Arrays;

public class OperasiArray {
    public static void main(String[] args){
        //buat array 2D
        int[][] array1 = {
            {19,18,17},
            {16,15,14},
            {13,12,11}
        };
        int[][] array2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        //print array 2D_1
        System.out.println("PRINT ARRAY 2D_1");
        System.out.print("==============================\n");
        printArray2D_1(array1);
        System.out.print("==============================\n");
        
        //print array 2D_2
        System.out.println("PRINT ARRAY 2D_2");
        System.out.print("==============================\n");
        printArray2D_2(array2);
        System.out.print("==============================\n");

        //Operasi Matriks (+)
        System.out.println("OPERASI MATRIKS (+)");
        System.out.print("==============================\n");
        tambahMatriks(array1, array2);
        System.out.print("==============================\n"); 
        
        //Operasi Matriks (-)
        System.out.println("OPERASI MATRIKS (-)");
        System.out.print("==============================\n");
        kurangMatriks(array1, array2);
        System.out.print("==============================\n");

        //Operasi Matriks (*)
        System.out.println("OPERASI MATRIKS (*)");
        System.out.print("==============================\n");
        kaliMatriks(array1, array2);
        System.out.print("==============================\n");
        
    }
    private static void printArray2D_1(int[][] ar1){
        for(int i = 0; i < ar1.length; i++){
            System.out.println(Arrays.toString(ar1[i]));
        }
    }
    private static void printArray2D_2(int[][] ar1){
        int baris = ar1.length;
        int kolom = ar1[0].length;
        int[][] hasil = new int[baris][kolom];
        for(int i = 0; i < ar1.length; i++){
            for(int j = 0; j < ar1[i].length; j++){
                hasil[i][j] = ar1[i][j];
            }
        }
        printArray2D_1(hasil);
    }
    private static void tambahMatriks(int[][] ar1, int[][] ar2){
        int baris = ar1.length;
        int kolom = ar1[0].length;
        int[][] hasil = new int[baris][kolom];
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                hasil[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        printArray2D_1(hasil);   
    }
    private static void kurangMatriks(int[][] ar1, int[][] ar2){
        int baris = ar1.length;
        int kolom = ar1[0].length;
        int[][] hasil = new int[3][3];
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                hasil[i][j] = ar1[i][j] - ar2[i][j];
            }
        }
        printArray2D_1(hasil);
    }
    private static void kaliMatriks(int[][] ar1, int[][] ar2){
        int baris_a = ar1.length;
        int kolom_a = ar1[0].length;
        // int baris_b = ar2.length;
        int kolom_b = ar2[0].length;
        int[][] hasil = new int[baris_a][kolom_b];
        int buffer;
        
        for(int i = 0; i < baris_a; i++){
            for(int j = 0; j < kolom_b; j++){
                buffer = 0;
                for(int k = 0; k < kolom_a; k++){
                    buffer += ar1[i][k] * ar2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
        printArray2D_1(hasil);
    }
}
//sebenarnya masih belum paham mengenai algoritma perkalian matriks
//tapi... skip dulu lah ;P
