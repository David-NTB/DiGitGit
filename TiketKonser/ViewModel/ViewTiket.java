package TiketKonser.ViewModel;

import TiketKonser.DataModel.Konser;
import TiketKonser.DataModel.Tiket;
import TiketKonser.Database.DataKonser;
import TiketKonser.Database.DataTiket;

public class ViewTiket {
    // final DataTiket dataTiket = new DataTiket();
    final DataKonser dataKonser = new DataKonser();

    public void showAllTiket(Konser konser){
        for (Tiket tiket : konser.getListTiket()) {
            System.out.printf("%10s %15s %8d %10d ", tiket.getJenis(),tiket.getNoSeri(), tiket.getStok(), tiket.getHarga());
            System.out.println();
        }
    }
}
