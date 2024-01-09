package TiketKonser.DataModel;

import java.util.ArrayList;

public class Konser {
    private String namaKonser;
    private ArrayList<Tiket> listTiket;

    public Konser(String namaKonser, ArrayList<Tiket> listTiket) {
        this.namaKonser = namaKonser;
        this.listTiket = listTiket;
    }

    public String getNamaKonser() {
        return namaKonser;
    }

    public void setNamaKonser(String namaKonser) {
        this.namaKonser = namaKonser;
    }

    public ArrayList<Tiket> getListTiket() {
        return listTiket;
    }

    public void setListTiket(ArrayList<Tiket> listTiket) {
        this.listTiket = listTiket;
    }
}
