package com.capgemini.gmailapplication.DAO;

import java.util.ArrayList;

import com.capgemini.gmailapplication.bean.Account_UserBean;
import com.capgemini.gmailapplication.bean.Inbox_Bean;

public interface Gmail_UserDAO {

	public void register();
	public Account_UserBean getLogin(String email , String password);
	public void compose(int user_id);
	public ArrayList<Inbox_Bean> showInbox(int userid);
	public Account_UserBean sender(String email);
	
}
