package TiketKonser.Database;

import java.util.ArrayList;
import java.util.Arrays;

import TiketKonser.DataModel.Konser;

public class DataKonser {
    private DataTiket dataTiket = new DataTiket();

    private ArrayList<Konser> listKonser = new ArrayList<>(
            Arrays.asList(
                    new Konser(
                            "Avenged Sevenfold",
                            dataTiket.getListTiket()),
                    new Konser(
                            "JKT 48",
                            dataTiket.getListTiket()),
                    new Konser(
                            "Superman is Dead",
                            dataTiket.getListTiket())));

    public ArrayList<Konser> getListKonser() {
        return listKonser;
    }

    public void addKonser(Konser konser){
        listKonser.add(konser);
    }

    public void showAllKonser(){
        for (Konser konser : listKonser) {
            konser.showKonser();
        }
    }
}
