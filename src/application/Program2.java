package application;

import java.util.Scanner;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartentDao();
		System.out.println("=== TEST 1: dedpartment findById ===");				
		Department department= departmentDao.findById(3);	
		System.out.println(department);
		
		
	
		
		
		
		sc.close();
		
		DB.closeConnection();
	}
}
