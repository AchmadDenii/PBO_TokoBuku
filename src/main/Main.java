package main;

import model.data_buku;
import model.data_kasir;
import view.kasirPage;

public class Main {
    public static void main(String[] args) {
        data_kasir.initialStaff();
        data_buku.initialBuku();
        new kasirPage();
    }
}