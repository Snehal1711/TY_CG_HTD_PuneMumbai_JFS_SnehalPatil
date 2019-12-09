package com.capgemini.jdbc.dao;


import java.util.List;

import com.capgemini.jdbc.beans.UserBean;

public interface UserDAO {
	public List<UserBean> getALLInfo();
	public UserBean getInfo(int userid);
	public UserBean login(int userid ,String password);

}
