package entity;

public class entity_transaksi {
    private int id_transaksi;
    private String tanggal;
    private String namaKasir;
    private int total = 0;

    public entity_transaksi(int id_transaksi, String tanggal, String namaKasir, int total) {
        this.id_transaksi = id_transaksi;
        this.tanggal = tanggal;
        this.namaKasir = namaKasir;
        this.total = total;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void cetak()
    {
        System.out.println("id transaksi    :"+this.id_transaksi);
        System.out.println("tanggal         :"+this.tanggal);
        System.out.println("nama_kasir      :"+this.namaKasir);
        System.out.println("total           :"+this.total);
    }
}
