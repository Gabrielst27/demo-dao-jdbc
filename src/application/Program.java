package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== TEST 2: seller findByDepartment depId ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 3: seller findByDepartment depName ===");
		dep = new Department(null, "Electronics");
		list = sellerDao.findByDepartment(dep);
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 4: seller findAll ===");
		list = sellerDao.findAll();
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("=== TEST 5: seller insert ===");
		Department dep1 = new Department(1, null);
		Seller newSeller = new Seller(null, "Maria Aparecida", "maria@gmail", new Date(), 4500.0, dep1);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());
		
		System.out.println();
		
		System.out.println("=== TEST 6: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Davi Rodrigues Torres");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println();
		
		System.out.println("=== TEST 7: seller delete ===");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
	}

}
