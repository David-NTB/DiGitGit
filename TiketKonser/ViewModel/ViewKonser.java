package TiketKonser.ViewModel;

import TiketKonser.DataModel.Konser;
import TiketKonser.Database.DataKonser;

public class ViewKonser {
    final DataKonser dataKonser = new DataKonser();
    final ViewTiket viewTiket = new ViewTiket();

    public void showAllKonser(){
        System.out.println("===============================================");
        for (Konser konser : dataKonser.getListKonser()) {
            System.out.println((dataKonser.getListKonser().indexOf(konser)+1) + ". Nama Konser : " + konser.getNamaKonser());
        }
        System.out.println("===============================================");
    }

    public void showAllTiketKonser(){
        for (Konser konser : dataKonser.getListKonser()) {
            System.out.println("Nama Konser : " + konser.getNamaKonser());
            System.out.println("===============================================");
            viewTiket.showAllTiket(konser);
            System.out.println("===============================================");
            System.out.println();
        }
    }

    public Konser selectKonser(String namaKonser){
        return dataKonser.getTiket(namaKonser);
    }


}
