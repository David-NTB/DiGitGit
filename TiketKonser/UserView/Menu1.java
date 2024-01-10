package TiketKonser.UserView;

import java.util.Scanner;

import TiketKonser.Database.DataKonser;
import TiketKonser.ViewModel.ViewKonser;

public class Menu1 {
    Scanner input = new Scanner(System.in);
    ViewKonser konser = new ViewKonser();

    public void run() {
        menu1();
    }

    private void menu1() {
        boolean menu1 = true;
        int userInput;

        while (menu1) {
            System.out.println("MENU 1");
            System.out.println("1. Lihat Semua Konser");
            System.out.println("2. Lihat Semua Tiket");
            System.out.println("3. Lihat Report");

            System.out.print("Pilihan : ");
            userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    showKonser();
                    break;

                case 2:
                    showTiket();
                    break;

                case 0:
                    menu1 = false;
                    break;

                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }

    }

    // method menu
    private void showKonser(){
        konser.showAllKonser();
    }

    private void showTiket(){

    }
}
