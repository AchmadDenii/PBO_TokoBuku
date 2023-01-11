package model;

import java.util.ArrayList;
import entity.entity_transaksi;
import util.DateString;

public class data_transaksi {
    private ArrayList<entity_transaksi> data_transaksi;
    int idIncrement = 0;

    public data_transaksi() {
        this.data_transaksi = new ArrayList<>();
    }

    public void create(String namaKasir){
        this.data_transaksi.add(new entity_transaksi(this.idIncrement, DateString.now(),namaKasir,0));
        this.idIncrement++;
    }

    public void setTotal(int total)
    {
        this.data_transaksi.get(this.idIncrement-1).setTotal(total);
    }

    public void cetak(int id)
    {
        for(entity_transaksi cetakId : data_transaksi){
            if(id==cetakId.getId_transaksi()){
                cetakId.cetak();
            }
        }
    }

    public int getIdIncrement() {
        return idIncrement-1;
    }
}
