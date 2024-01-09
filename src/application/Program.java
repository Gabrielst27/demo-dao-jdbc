package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Gabriel", "gabrielst328@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
	}

}
