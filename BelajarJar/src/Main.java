package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Main{

    public static void main(String[] args) throws IOException{
        
        FileReader fileInput = new FileReader("BelajarJar/FileBaru.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        
        Scanner scanner = new Scanner(bufferedReader);

        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
    }
}