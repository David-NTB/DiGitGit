package TiketKonser.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    final static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void cls(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    
    public static void pressEnter(){
        System.out.print("\nTekan ENTER untuk lanjut");

        inputLine();
        cls();
    }

    public static String inputLine(){
        try {
            return input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int inputInt(){
        try {
            return Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return inputInt();
        }
    }
}
