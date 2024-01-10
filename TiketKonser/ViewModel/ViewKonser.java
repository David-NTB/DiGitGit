package TiketKonser.ViewModel;

import TiketKonser.DataModel.Konser;
import TiketKonser.Database.DataKonser;

public class ViewKonser {
    final DataKonser dataKonser = new DataKonser();

    public void showAllKonser(){
        for (Konser konser : dataKonser.getListKonser()) {
            System.out.println("Nama Konser : " + konser.getNamaKonser());
            System.out.println("Tiket : " + konser.getListTiket());
        }
    }

}
