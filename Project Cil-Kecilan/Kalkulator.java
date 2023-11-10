import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class kalkulator {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static String ch, temp;
    static double a, b, hasil;

    public static void main(String[] args) throws IOException {
        String next;
        do {
            next = "n";

            cls();
            menu();
            choice(ch);
            hasil();

            System.out.print("\nLanjut menghitung?(y/n) : ");
            next = input.readLine();
        } while (next.equals("y"));

    }

    static String menu() throws IOException {
        System.out.println("==============================");
        System.out.println("KALKULATOR JAVA");
        System.out.println("==============================");

        System.out.println("\n1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("\nMasukkan jenis operasi\t: ");
        ch = input.readLine();

        System.out.println("\n==============================");

        System.out.print("\nMasukkan angka pertama\t: ");
        temp = input.readLine();
        a = Double.parseDouble(temp);

        System.out.print("Masukkan angka kedua\t: ");
        temp = input.readLine();
        b = Double.parseDouble(temp);

        System.out.println("\n==============================");

        return ch;
    }

    static double choice(String ch) {
        switch (ch) {
            case "1", "Penjumlahan", "tambah", "+":
                hasil = a + b;
                break;

            case "2", "Pengurangan", "kurang", "-":
                hasil = a - b;
                break;

            case "3", "Perkalian", "kali", "*":
                hasil = a * b;
                break;

            case "4", "Pembagian", "bagi", "/":
                hasil = a / b;
                break;

            default:
                break;

        }
        return hasil;
    }

    static void hasil() {
        System.out.println("\nHasil\t: " + hasil);
        System.out.println("\n==============================");
    }

    static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}