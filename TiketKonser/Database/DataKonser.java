package TiketKonser.Database;

import java.util.ArrayList;
import java.util.Arrays;

import TiketKonser.DataModel.Konser;
import TiketKonser.DataModel.Tiket;

public class DataKonser {
        final DataTiket dataTiket = new DataTiket();

        private ArrayList<Konser> listKonser = new ArrayList<>(
                Arrays.asList(
                        new Konser(
                                "NDX AKA",
                                dataTiket.newListTiket()),
                        new Konser(
                                "Avenged Sevenfold",
                                dataTiket.newListTiket()),
                        new Konser(
                                "JKT 48",
                                dataTiket.newListTiket()),
                        new Konser(
                                "Superman is Dead",
                                dataTiket.newListTiket())));

        public ArrayList<Konser> getListKonser() {
                return listKonser;
        }

        public ArrayList<Tiket> getListTiket() {
                return getKonser(0).getListTiket();
        }

        public void addKonser(Konser konser) {
                listKonser.add(konser);
        }

        public void editKonser(int index, Konser konser) {
                listKonser.set(index, konser);
        }

        public void deleteKonser(Konser konser) {
                listKonser.remove(konser);
        }

        public Konser getKonser(int index) {
                return listKonser.get(index);
        }

        // public Konser getTiket(String namaKonser){
        // return
        // listKonser.stream().filter(cekTiket->cekTiket.getNamaKonser().equals(namaKonser)).findFirst().orElse(null);
        // }

}
