package controller;

import entity.entity_kasir;
import model.data_kasir;

public class Login {

    entity_kasir kasir;
    public entity_kasir loggedStaff(){
        return kasir;
    }

    public boolean loginKasir(String nip,String password){
        for(entity_kasir cekLogin : data_kasir.data_staff){
            if(cekLogin.getNip().equals(nip) && cekLogin.getPassword().equals(password)) {
                kasir = cekLogin;
                return true;
            }
        }
        return false;
    }

}

