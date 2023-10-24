package source;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        byte ch = 1;

        while (ch != 0) {

            String temp = "";

            cls();

            System.out.println("==============================");
            System.out.println("PALIKASI DATA PANITIA");
            System.out.println("==============================\n");

            System.out.println("1. Input panitia");
            System.out.println("2. Cari panitia");
            System.out.println("3. List semua panitia");
            System.out.println("4. Ubah panitia");
            System.out.println("5. Hapus panitia");
            System.out.println("0. Tutup aplikasi");

            System.out.println("\n==============================\n");

            System.out.print("Pilihan anda(angka): ");
            temp = userInput.readLine();
            try {
                if (temp.equals("")) {
                    ch = 9;
                } else {
                    ch = Byte.parseByte(temp);
                }

                switch (ch) {
                    case 1:
                        System.out.println("Pilihan 1");
                        next();
                        break;

                    case 2:
                        System.out.println("Pilihan 2");
                        next();
                        break;

                    case 3:
                        listPanitia();
                        next();
                        break;

                    case 4:
                        System.out.println("Pilihan 4");
                        next();
                        break;

                    case 5:
                        System.out.println("Pilihan 5");
                        next();
                        break;

                    case 0:
                        closeAPK();
                        break;

                    default:
                        msg("Pilihan tidak ada");
                        next();
                        break;
                }
            }

            catch (Exception e) {
                msg("Pilihan tidak ada");
                next();

            }
        }
    }

    private static void listPanitia() throws IOException {

        cls();

        System.out.println("==============================");
        System.out.println("LIST SEMUA PANITIA");
        System.out.println("==============================\n");

        try {
            BufferedReader bufferedInput = new BufferedReader(new FileReader("../Database.txt"));

            System.out.println("| ID\t| Nama Lengkap\t\t| Angkatan | Jabatan\t\t     |");
            System.out.println("----------------------------------------------------------------------");

            String data = bufferedInput.readLine();
            int jmlData = 0;
            while (data != null) {
                jmlData++;

                StringTokenizer stringToken = new StringTokenizer(data, ",");

                System.out.printf("| %-6s", stringToken.nextToken());
                System.out.printf("| %-22s", stringToken.nextToken());
                System.out.printf("| %-9s", stringToken.nextToken());
                System.out.printf("| %-24s|\n", stringToken.nextToken());

                data = bufferedInput.readLine();
            }

        } catch (Exception e) {
            msg("File 'database.txt' tidak ada");
        }

    }

    private static void msg(String message) {
        System.err.println("Message: " + message);
    }

    private static void cls() throws IOException {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            msg("" + e);
        }
    }

    private static void closeAPK() throws IOException {
        msg("Menutup aplikasi");
        cls();
        System.exit(0);
    }

    private static void next() throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n==============================");
        System.out.print("Tekan ENTER untuk lanjut");
        String temp = userInput.readLine();
        System.out.println(temp);

    }

}
