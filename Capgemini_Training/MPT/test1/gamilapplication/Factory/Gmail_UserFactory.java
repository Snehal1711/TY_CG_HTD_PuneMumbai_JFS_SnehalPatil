package com.capgemini.gamilapplication.Factory;

import com.capgemini.gmailapplication.DAO.Gmail_Implementation;
import com.capgemini.gmailapplication.DAO.Gmail_UserDAO;

public class Gmail_UserFactory {
	private Gmail_UserFactory() {
		
	}
	
	public static Gmail_UserDAO getInstance() {
		Gmail_UserDAO dao = new Gmail_Implementation();
		return dao;
	}

}
