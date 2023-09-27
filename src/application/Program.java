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
        Seller obj = new Seller(null,"Breno","breno@gmail",d1,3500.0,dep);




        Seller dois = sellerDao.findById(11);
        System.out.println(dois);


    }
}
