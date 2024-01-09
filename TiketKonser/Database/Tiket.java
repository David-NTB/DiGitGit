package TiketKonser.Database;

public class Tiket {
    private String jenis;
    private String noSeri;
    private int stok;
    private int harga;

    Tiket(String jenis, String noSeri, int stok, int harga) {
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

    public void showTiket(){
        System.out.println();
        System.out.println("Jenis  : " + this.jenis);
        System.out.println("noSeri : " + this.noSeri);
        System.out.println("Stok   : " + this.stok);
        System.out.println("Harga  : " + this.harga);
    }
}
