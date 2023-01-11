package model;
import entity.entity_detailTransaksi;
import entity.entity_buku;
import java.util.ArrayList;

public class data_detailTransaksi {
    private ArrayList<entity_detailTransaksi> data_Tr;

    public data_detailTransaksi() {
        this.data_Tr = new ArrayList<entity_detailTransaksi>();
    }

    public void create(int idTransaksi, int jumlah, entity_buku buku){
        this.data_Tr.add(new entity_detailTransaksi(idTransaksi,jumlah,buku));
    }

    public void view(){
        for (int i=0;i<this.data_Tr.size();i++)
        {
            this.data_Tr.get(i).cetak();
        }
    }

    public void view_byId(int idTransaksi)
    {
        for (int i=0;i<this.data_Tr.size();i++)
        {
            if (idTransaksi==this.data_Tr.get(i).getId_transaksi()) {
                this.data_Tr.get(i).cetak();
            }
        }
    }

    public int getTotalbyId(int idTransaksi)
    {
        int total = 0;
        for (int i=0;i<this.data_Tr.size();i++)
        {
            if (idTransaksi==this.data_Tr.get(i).getId_transaksi()) {
                total = total + this.data_Tr.get(i).getTotal();
            }
        }
        return total;
    }
}
