package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Department dep = new Department(1,null);
        Date date = new Date(2005-02-24);

        Seller obj = new Seller(null,"Paulo","paulo@gmail",date,3500.0,dep);

        System.out.println("\nTEST 1 \n insert obj \n");
        sellerDao.insert(obj);
        System.out.println("obj:\n" + obj);

        // =====================================================

        System.out.println("\nTEST 2: \n find by id \n");
        Seller obj2 = sellerDao.findById(1);
        System.out.println(obj2);

        // =====================================================

        System.out.println("\nTEST 3: \n delete obj \n");
        System.out.println("deleted seller: " + obj);
        sellerDao.deleteById(obj.getId());

        // =====================================================

        System.out.println("\nTEST 4: \n find all sellers \n");
        List<Seller> list = sellerDao.findAll();
        for(Seller x : list) System.out.println(x);

        // =====================================================

        System.out.println("\nTEST 5: \n update seller \n");
        Seller obj3 = obj;
        System.out.println("before changes: " + obj3);
        obj3.setName("henrique");
        obj3.setEmail("henrique@gmail.com");
        System.out.println("\n\nafter changes: " + obj3);
        sellerDao.update(obj3);

        // =====================================================

        System.out.println("\nTEST 4: \n find by department \n");
        List<Seller> list2 = sellerDao.findByDepartment(dep);
        for(Seller x2 : list2) System.out.println(x2);

    }
}
