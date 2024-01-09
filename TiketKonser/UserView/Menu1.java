package TiketKonser.UserView;

import java.util.ArrayList;
import java.util.Arrays;

import TiketKonser.Database.Tiket;

public class Menu1 {
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
