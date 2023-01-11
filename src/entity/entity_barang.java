package entity;

public class entity_barang {
    public String judul;
    public int harga;

    public entity_barang(String judul, int harga) {
        this.judul = judul;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void cetak(){
        System.out.println("MERK  : " + judul);
        System.out.println("HARGA : " + harga);
    }
}
