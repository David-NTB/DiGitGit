package TiketKonser.Database;

import java.util.ArrayList;
import java.util.Arrays;

import TiketKonser.DataModel.Tiket;

public class DataTiket {
        // DataKonser dataKonser = new DataKonser();
        ArrayList<Tiket> listTiket;

        public ArrayList<Tiket> newListTiket() {
                return listTiket = new ArrayList<Tiket>(
                        Arrays.asList(
                                new Tiket(
                                        "REGULAR",
                                        "REG_NO_SERI",
                                        0,
                                        0),
                                new Tiket(
                                        "VIP",
                                        "VIP_NO_SERI", 
                                        0, 
                                        0),
                                new Tiket(
                                        "LEGEND", 
                                        "LEG_NO_SERI", 
                                        0, 
                                        0)));
        }

        public void addTiket(Tiket tiket) {
                listTiket.add(tiket);
        }

        public void editTiket(int index, Tiket tiket) {
                listTiket.set(index, tiket);
        }

        public void deleteTiket(Tiket tiket) {
                listTiket.remove(tiket);
        }

        public Tiket getTiket(String jenis) {
                return listTiket.stream().filter(cekTiket -> cekTiket.getJenis().equals(jenis)).findFirst()
                                .orElse(null);
        }
}
