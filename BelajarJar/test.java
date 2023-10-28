import java.util.Scanner;

public class test {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int income = 0;
        double pajakTotal = 0;

        System.out.println("\n==============================");
        System.out.println("PAJAK PENGHASILAN SETAHUN");
        System.out.println("==============================\n");

        System.out.print("Income(jt)\t: ");
        income = input.nextInt();

        boolean next = false;
        double[] tarif = { 0, 5, 15, 25, 30, 35 };
        int[] wajibPajak = { 0, 60, 190, 250, 4500 };
        double[] kuartil = { 0, 0, 0, 0, 0, 0 };
        int i = 0;


        if(income >= wajibPajak[5]){
            income -= wajibPajak[5];
            kuartil[5] = wajibPajak[5] * (tarif[5]/100);

            pajakTotal += kuartil[5];
            i++;
        }

        long a = 9999999999L;

    }
}
