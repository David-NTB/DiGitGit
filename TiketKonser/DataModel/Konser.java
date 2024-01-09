package TiketKonser.DataModel;

import java.util.ArrayList;

public class Konser {
    private String namaKonser;
    private ArrayList<DataTiket> listTiket;

    Konser(String namaKonser, ArrayList<DataTiket> listTiket) {
        this.namaKonser = namaKonser;
        this.listTiket = listTiket;
    }

    public String getNamaKonser() {
        return namaKonser;
    }
}
