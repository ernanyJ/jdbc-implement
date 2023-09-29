package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {


    public static void main(String[] args) {

        DepartmentDao depDao = DaoFactory.createDepartmenDao();
        Department dep = depDao.findById(12);

        List<Department> list = depDao.findAll();
        for(Department x : list){
            System.out.println(x);
        }

    }


}
