package view;
import controller.Login;
import entity.entity_buku;
import model.data_buku;
import model.data_detailTransaksi;
import model.data_transaksi;

import java.util.Scanner;
public class kasirPage {

    Scanner input = new Scanner(System.in);
    Login cek = new Login();
    data_transaksi dataTransaksi = new data_transaksi();
    data_detailTransaksi detTransansaksi = new data_detailTransaksi();

    public kasirPage(){
        login();
    }

    public void login(){
        int pilih;
        do {
            System.out.print("""
                    1.Login
                    2.Exit
                    Select : """);
            pilih=input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1 -> loginPage();
                case 2 -> exit();
                default -> System.out.println("Inputan salah");
            }
        }while(pilih!=2);
    }


    public void loginPage(){
        boolean status=false;
        do{
            System.out.print("Nip  : ");
            String nip = input.nextLine();
            System.out.print("Pass : ");
            String password = input.nextLine();
            status = cek.loginKasir(nip,password);
            if(status){
                System.out.println("Login Berhasil");
                startMenuPage();
            }
            else{
                System.out.println("nip atau password salah");
                status = false;
            }
        }while(status==false);

    }

    private void exit(){
        System.out.println("Exit...");
    }

    private void back(){
        System.out.println("Back...");
    }
    private void startMenuPage() {
        int pilih;
        do {
            System.out.print("""
                    1.Transaksi
                    2.Kembali
                    Select : """);
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih){
                case 1->selectProduct();
                case 2->back();
                default -> System.out.println("Inputan salah");
            }
        }while(pilih!=2);
    }


    public void selectProduct(){
        String pilih;
        String namaKasir = cek.loggedStaff().getNama();
        dataTransaksi.create(namaKasir);
        System.out.println("-----ListBuku-----");
        data_buku.view();
        do {
            System.out.println("----Transaksi----");
            System.out.print("Input Judul : ");
            String judulBuku = input.nextLine();
            entity_buku buku = data_buku.searchByTitle(judulBuku);
            System.out.print("Jumlah : ");
            int jml = input.nextInt();
            input.nextLine();
            detTransansaksi.create(dataTransaksi.getIdIncrement(),jml,buku);
            System.out.println("Pilih Lagi ? (y/t) : ");
            pilih = input.nextLine();
            if(!pilih.equals("y") && !pilih.equals("t")){
                System.out.println("inputan salah");
            }
        }while(!pilih.equals("t"));
        detTransansaksi.view_byId(dataTransaksi.getIdIncrement());
        dataTransaksi.setTotal(detTransansaksi.getTotalbyId(dataTransaksi.getIdIncrement()));
        dataTransaksi.cetak(dataTransaksi.getIdIncrement());
    }

}
