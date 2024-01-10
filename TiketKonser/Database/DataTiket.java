package TiketKonser.Database;

import java.util.ArrayList;
import java.util.Arrays;

import TiketKonser.DataModel.Tiket;

public class DataTiket {
    private ArrayList<Tiket> listTiket = new ArrayList<>(
            Arrays.asList(
                    new Tiket(
                            "REGULAR",
                            "NO SERI",
                            50,
                            50000),
                    new Tiket(
                            "VIP",
                            "NO SERI",
                            50,
                            50000),
                    new Tiket(
                            "LEGEND",
                            "NO SERI",
                            50,
                            50000)));

    public ArrayList<Tiket> getListTiket() {
        return listTiket;
    }

    public void addTiket(Tiket tiket){
        listTiket.add(tiket);
    }

    public void editTiket(int index, Tiket tiket) {
        listTiket.set(index, tiket);
    }

    public void deleteTiket(Tiket tiket){
        listTiket.remove(tiket);
    }

    public Tiket getTiket(String jenis){
        return listTiket.stream().filter(cekTiket->cekTiket.getJenis().equals(jenis)).findFirst().orElse(null);
    }
}
