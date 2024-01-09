package TiketKonser.UserView;

import java.util.ArrayList;
import java.util.Arrays;

import TiketKonser.Database.DataTiket;

public class Menu1 {
    private ArrayList<DataTiket> listTiket = new ArrayList<>(
            Arrays.asList(
                    new DataTiket(
                            "REGULAR",
                            "NO SERI",
                            50,
                            50000),
                    new DataTiket(
                            "VIP",
                            "NO SERI",
                            50,
                            50000),
                    new DataTiket(
                            "LEGEND",
                            "NO SERI",
                            50,
                            50000)));

    public ArrayList<DataTiket> getListTiket() {
        return listTiket;
    }

    public void editListTiket(int index, DataTiket tiket) {
        listTiket.set(index, tiket);
    }
}
