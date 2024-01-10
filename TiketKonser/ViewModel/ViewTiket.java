package TiketKonser.ViewModel;

import TiketKonser.DataModel.Konser;
import TiketKonser.DataModel.Tiket;
import TiketKonser.Database.DataTiket;

public class ViewTiket {
    final DataTiket dataTiket = new DataTiket();

    public void showAllTiket(Konser konser){
        for (Tiket tiket : dataTiket.getListTiket()) {
            System.out.println("Jenis   : " + tiket.getJenis());
            System.out.println("No Seri : " + tiket.getNoSeri());
            System.out.println("Stok    : " + tiket.getStok());
            System.out.println("Harga   : " + tiket.getHarga());
        }
    }
}
