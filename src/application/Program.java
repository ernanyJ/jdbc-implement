package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Date d1 = new Date(2004,06,24);

        Department dep = new Department(1,null);


        Seller sel2 = sellerDao.findById(17);

        System.out.println(sel2 + "\n\n");

        sel2.setName("milote");
        sel2.setEmail("milhote@gmaill");

        System.out.println("updated sel 2\n\n" + sel2 + "\n\n");

        sellerDao.update(sel2);

       // sellerDao.findById(11);


    }
}
