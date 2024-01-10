package TiketKonser.DataModel;

import java.util.ArrayList;

import TiketKonser.Database.DataTiket;

public class Konser {
    private String namaKonser;
    private ArrayList<DataTiket> listTiket;

    public Konser(String namaKonser, ArrayList<DataTiket> listTiket) {
        this.namaKonser = namaKonser;
        this.listTiket = listTiket;
    }

    public String getNamaKonser() {
        return namaKonser;
    }

    public void setNamaKonser(String namaKonser) {
        this.namaKonser = namaKonser;
    }

    public ArrayList<DataTiket> getListTiket() {
        return listTiket;
    }

    public void setListTiket(ArrayList<DataTiket> listTiket) {
        this.listTiket = listTiket;
    }
}
