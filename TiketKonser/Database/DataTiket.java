package TiketKonser.Database;

public class DataTiket {
    private String jenis;
    private String noSeri;
    private int stok;
    private int harga;

    DataTiket(String jenis, String noSeri, int stok, int harga) {
        this.jenis = jenis;
        this.noSeri = noSeri;
        this.stok = stok;
        this.harga = harga;
    }

    public void editTiket(String jenis, int stok, int harga) {
        this.jenis = jenis;
        this.stok = stok;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNoSeri() {
        return noSeri;
    }

    public void setNoSeri(String noSeri) {
        this.noSeri = noSeri;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
