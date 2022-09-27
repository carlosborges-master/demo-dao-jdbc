package application;

import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartentDao();
		
		System.out.println("=== TEST 1: department findById ===");				
		Department department= departmentDao.findById(4);	
		System.out.println(department);
		
		System.out.println();
		
		System.out.println("=== TEST 2: department findAll ===");	
		List<Department> list = departmentDao.findAll();
		for (Department dep : list){
			System.out.println(dep);
		}
	 
		
		 System.out.println("\n=== TEST 3: department insert ====");
			Department newDepartment = new Department(null, "Administrativo");
			departmentDao.insert(newDepartment);
			System.out.println("Inserted! New department Id = " + newDepartment.getId());
		
		
		DB.closeConnection();
	}
}
