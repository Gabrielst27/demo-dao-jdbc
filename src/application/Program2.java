package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findAll ===");
		List<Department> deps = depDao.findAll();
		for(Department d : deps) {
			System.out.println(d);
		}

	}

}
