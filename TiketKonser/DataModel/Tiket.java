package TiketKonser.DataModel;

import java.util.ArrayList;
import java.util.Arrays;

import TiketKonser.Database.DataTiket;

public class Tiket {
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

    public void editListTiket(int index, Tiket tiket) {
        listTiket.set(index, tiket);
    }
}
