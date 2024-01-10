package TiketKonser.Database;

import java.util.ArrayList;
import java.util.Arrays;

import TiketKonser.DataModel.Konser;

public class DataKonser {

        DataTiket dataTiket;

    private ArrayList<Konser> listKonser = new ArrayList<>(
            Arrays.asList(
                    new Konser(
                            "Avenged Sevenfold",
                            new ArrayList<DataTiket>()),
                    new Konser(
                            "JKT 48",
                            new ArrayList<DataTiket>()),
                    new Konser(
                            "Superman is Dead",
                            new ArrayList<DataTiket>()))
                            );

    public ArrayList<Konser> getListKonser() {
        return listKonser;
    }

    public void addKonser(Konser konser){
        listKonser.add(konser);
    }

    public void editKonser(int index, Konser konser){
        listKonser.set(index, konser);
    }
    
    public void deleteTiket(Konser konser){
        listKonser.remove(konser);
    }

    public Konser getTiket(String namaKonser){
        return listKonser.stream().filter(cekTiket->cekTiket.getNamaKonser().equals(namaKonser)).findFirst().orElse(null);
    }

    public ArrayList<DataTiket> getDataTiket(int index){
        return listKonser.get(index).getListTiket();
    }
}
