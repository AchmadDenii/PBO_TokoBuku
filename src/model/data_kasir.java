package model;
import entity.entity_kasir;
import java.util.ArrayList;
import controller.Login;

public class data_kasir {
    public static ArrayList<entity_kasir> data_staff = new ArrayList<>();

    public static void initialStaff(){
        data_staff.add(new entity_kasir("Andhika","123","123"));
        data_staff.add(new entity_kasir("Deny","234","234"));
    }
}