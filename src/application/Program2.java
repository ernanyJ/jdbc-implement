package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {


    public static void main(String[] args) {

        DepartmentDao depDao = DaoFactory.createDepartmenDao();
        Department dep = depDao.findById(12);
        System.out.println(dep);
        depDao.deleteById(12);


    }


}
