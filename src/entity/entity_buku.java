package entity;

public class entity_buku extends entity_barang{
    public int kodeBarang;

    public entity_buku(String Judul, int harga,int kodeBarang) {
        super(Judul, harga);
        this.kodeBarang=kodeBarang;
    }

    public int getKodeBarang(){
        return kodeBarang;
    }

    public void cetak(){
        super.cetak();
        System.out.println("KODE BARANG : "+getKodeBarang());
        System.out.println();
    }
}
