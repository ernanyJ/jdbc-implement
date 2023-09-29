package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program2 {


    public static void main(String[] args) {


        Department dep = new Department(null,"Test");
        DepartmentDao dao = DaoFactory.createDepartmenDao();


        System.out.println("\nTEST 1 \n insert obj \n");
        dao.insert(dep);
        System.out.println("dep:\n" + dep);

        // =====================================================

        System.out.println("\nTEST 2: \n find by id \n");
        Department obj = dao.findById(1);
        System.out.println(obj);

        // =====================================================

        System.out.println("\nTEST 3: \n delete obj \n");
        System.out.println("deleted department: " + dep);
        dao.deleteById(dep.getId());

        // =====================================================

        System.out.println("\nTEST 4: \n find all departments \n");
        List<Department> list = dao.findAll();
        for(Department x : list) System.out.println(x);

        // =====================================================

        System.out.println("\nTEST 5: \n update department \n");
        Department dep2 = dep;
        System.out.println("before changes: " + dep2);
        dep2.setName("testchange");
        System.out.println("\n\nafter changes: " + dep2);
        dao.update(dep2);
        
    }


}
