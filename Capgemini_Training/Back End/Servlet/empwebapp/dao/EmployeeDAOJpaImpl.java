package com.capgemini.empwebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;

public class EmployeeDAOJpaImpl implements EmployeeDAO{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		
		EntityManager em = emf.createEntityManager();
		EmployeeInfoBean employee= em.find(EmployeeInfoBean.class, empId);
		em.close();
		return employee;
	}//end of getEmployee

	@Override
	public EmployeeInfoBean authenticate(int empId, String pwd) {
		EntityManager em = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean where empId= :empId and password= :pwd";
		Query query = em.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", pwd);
		
		EmployeeInfoBean employee =null;
		try {
			employee =(EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
			return employee;
	}//end of auth

	@Override
	public boolean addEmployee(EmployeeInfoBean employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		boolean isAdded= false;
		try {
			tx.begin();
			em.persist(employee);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return isAdded;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean eib) {
		EntityManager em = emf.createEntityManager();
		EmployeeInfoBean infoBean =em.find(EmployeeInfoBean.class, eib.getEmpId());
		boolean isUpdated= false;

		if(infoBean != null) {
			String name = eib.getEmpname();
			if(name!=null) {
				infoBean.setEmpname(name);
			}
			
			int age =eib.getAge();
			if(age !=0) {
				infoBean.setAge(age);
			}
			
			double salary =eib.getSalary();
			if(salary >0) {
				infoBean.setSalary(salary);
			}
			
			long mobile = eib.getMobile();
			if(mobile >0) {
				infoBean.setMobile(mobile);
			}
			
			String designation=eib.getDesignation();
			if(designation!=null) {
				infoBean.setDesignation(designation);
			}
			
			char gender =eib.getGender();
			if(gender =='M'|| gender =='F'||gender =='m'||gender =='f') {
				infoBean.setGender(gender);
			}
			
			String pwd = eib.getPassword();
			if(pwd != null) {
				infoBean.setPassword(pwd);
			}
			
			try {
				EntityTransaction tx =em.getTransaction();
				tx.begin();
				em.persist(infoBean);
				tx.commit();
				isUpdated=true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			em.close();

		}
			return isUpdated;
	}
	
}//end of class
