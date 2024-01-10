package TiketKonser.UserView;

import TiketKonser.Util.Util;

import TiketKonser.ViewModel.ViewKonser;
import TiketKonser.ViewModel.ViewTiket;

public class Menu1 {
    final ViewKonser viewKonser = new ViewKonser();
    final ViewTiket viewTiket = new ViewTiket();

    public void run() {
        menu1();
    }

    private void menu1() {
        boolean menu1 = true;
        int userInput;

        while (menu1) {
            Util.cls();
            System.out.println("MENU 1");
            System.out.println("1. Lihat Semua Konser");
            System.out.println("2. Lihat Semua Tiket");
            System.out.println("3. Lihat Tiket");
            System.out.println("4. Edit Tiket");
            System.out.println("0. Keluuar");
            System.out.println();
            System.out.print("Pilihan : ");
            userInput = Util.inputInt();

            Util.pressEnter();
            Util.cls();

            switch (userInput) {
                case 1:
                    showAllKonser();
                    break;

                case 2:
                    showAllTiket();
                    break;

                case 3:
                    showTiket();
                    break;

                case 4:
                    editTiket();
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
    private void showAllKonser(){
        viewKonser.showAllKonser();
        Util.pressEnter();
    }

    private void showAllTiket(){
        viewKonser.showAllTiketKonser();
        Util.pressEnter();
    }

    private void showTiket(){
        viewKonser.showAllKonser();
        System.out.print("Pilih nama konser : ");

        int indexKonser = Util.inputInt()-1;

        viewTiket.showAllTiket(viewKonser.selectKonser(indexKonser));
        System.out.println();

        Util.pressEnter();

    }

    private void editTiket(){
        System.out.print("index : ");
        int index = Util.inputInt();
        
        System.out.print("jenis : ");
        String jenis = Util.inputLine();
        System.out.print("noSeri : ");
        String noSeri = Util.inputLine();
        System.out.print("stok : ");
        int stok = Util.inputInt();
        System.out.print("harga : ");
        int harga = Util.inputInt();

        viewTiket.editTiket(index, jenis, noSeri, stok, harga);
    }

}
