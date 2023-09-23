package application;


import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department dep = new Department(1,"Electronics");
        Seller seller = new Seller(1,"Ernany","ernany@gmail.com",new Date(),3000.0,dep);
        System.out.println(seller);
    }
}
