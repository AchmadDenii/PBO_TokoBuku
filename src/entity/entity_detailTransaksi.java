package entity;

public class entity_detailTransaksi {
    private int id_transaksi;
    private int jumlah;
    private entity_buku objBuku;
    private int total;

    public entity_detailTransaksi(int id_transaksi, int jumlah, entity_buku objBuku) {
        this.id_transaksi = id_transaksi;
        this.jumlah = jumlah;
        this.objBuku = objBuku;
        this.total = jumlah*objBuku.getHarga();
    }

    public int getTotal() {
        return total;
    }

    public void cetak()
    {
        System.out.println("id transaksi :"+this.id_transaksi);
        System.out.println("jumlah :"+ this.jumlah);
        System.out.println("id barang :"+objBuku.getKodeBarang());
        System.out.println("nama barang :"+objBuku.getJudul());
        System.out.println("harga    :"+objBuku.getHarga());
        System.out.println("total :"+this.jumlah*objBuku.getHarga());
        System.out.println("================================");
    }

    public int getId_transaksi() {
        return id_transaksi;
    }
}
