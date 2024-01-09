package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//Constructor SellerDaoJDBC
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
