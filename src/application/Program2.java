package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {


    public static void main(String[] args) {

        DepartmentDao depDao = DaoFactory.createDepartmenDao();
        Department dep = new Department(null,"Toys");

        System.out.println(dep);

        depDao.insert(dep);

        System.out.println(dep);


    }


}
