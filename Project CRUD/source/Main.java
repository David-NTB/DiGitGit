package source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) {
        CRUD cek = new CRUD();
        cek.menu();
    }
}

class CRUD{
    BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    

    void next() throws IOException {
        System.out.println("\n==============================");
        System.out.print("Tekan ENTER untuk lanjut");
        String temp = userInput.readLine();
        menu();
    }

    void cls(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    void closeAPK(){
        try{
            System.out.println("Menutup aplikasi");
            cls();
            
        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }
        
    }

    void menu(){
        try {
            byte ch;
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
            
            if(temp.equals("")){
                ch = 9;
            } else{
                ch = Byte.parseByte(temp);
            }

            switch(ch){
                case 1:
                    System.out.println("Pilihan 1");
                    next();
                    break;

                case 2:
                    searchPanitia();
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
                    System.err.println("Message: Pilihan tidak ada");
                    next();
                    break;
            }

        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    void listPanitia() throws IOException {
        FileReader fileInput;
        BufferedReader bufferedInput;

        cls();
        
        System.out.println("==============================");
        System.out.println("LIST SEMUA PANITIA");
        System.out.println("==============================\n");


        try {
            fileInput = new FileReader("Project CRUD/Database.txt");
            bufferedInput = new BufferedReader(fileInput);

        } catch (Exception e) {
            System.err.println("Error: Data tidak ada, silahkan tambah file");
            return;
        }

        System.out.println("| ID\t| Nama Lengkap\t\t| Angkatan | Jabatan\t\t     |");
        System.out.println("----------------------------------------------------------------------");

        String data = bufferedInput.readLine();
        int jmlData = 0;
        while (data != null) {
            jmlData++;
            
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            
            System.out.printf("| %-6s" , stringToken.nextToken());
            System.out.printf("| %-22s" , stringToken.nextToken());
            System.out.printf("| %-9s" , stringToken.nextToken());
            System.out.printf("| %-24s|\n" , stringToken.nextToken());

            data = bufferedInput.readLine();
        }

        

    }
    
    void searchPanitia() throws IOException {
        FileReader fileInput;
        BufferedReader bufferedInput;

        cls();

        System.out.println("==============================");
        System.out.println("CARI PANITIA");
        System.out.println("==============================\n");

         try {
            File file = new File("Project CRUD/Database.txt");
            

        } catch (Exception e) {
            System.err.println("Error: Data tidak ada, silahkan tambah file");
            return;
        }

        System.out.print("Masukkan kata kunci: ");
        String keyWord = userInput.readLine();
        String[] keyWordArr = keyWord.split("\\s");
        
        checkData(keyWordArr);

        

    }

    void checkData(String[] keyword) throws IOException {
        FileReader fileInput = new FileReader("Project CRUD/Database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        String data = bufferedInput.readLine();
        boolean isExist;
        int jmlData = 0;

        System.out.println("\n| ID\t| Nama Lengkap\t\t| Angkatan | Jabatan\t\t     |");
        System.out.println("----------------------------------------------------------------------");

        while (data != null) {
            isExist = true;
            
            for(String keyW:keyword){
                isExist = isExist && data.toLowerCase().contains(keyW.toLowerCase());
            }


            if (isExist) {
                StringTokenizer stringToken = new StringTokenizer(data, ",");
            
                System.out.printf("| %-6s" , stringToken.nextToken());
                System.out.printf("| %-22s" , stringToken.nextToken());
                System.out.printf("| %-9s" , stringToken.nextToken());
                System.out.printf("| %-24s|\n" , stringToken.nextToken());
            }
            
            data = bufferedInput.readLine();
        }

    }
}