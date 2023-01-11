package model;
import entity.entity_buku;

import java.util.ArrayList;

public class data_buku {

    static ArrayList<entity_buku> buku = new ArrayList<>();

    public static void initialBuku(){
        buku.add(new entity_buku("informatika",100000,1));
        buku.add(new entity_buku("fisika",75000,2));
        buku.add(new entity_buku("biologi",50000,3));
    }


    public static void view(){
        for (int i = 0; i < buku.size(); i++) {
            buku.get(i).cetak();
        }
    }

    public static entity_buku searchByTitle(String judulBuku){
        for (entity_buku searchBook : buku){
            if(searchBook.getJudul().equals(judulBuku)){
                return searchBook;
            }
        }
        return null;
    }
}
