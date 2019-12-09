package com.capgemini.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.springrest.beans.EmployeeInfoBean;

@Repository   // this is used when we don,t provide any configuration
public class EmployeeDAOJpaImpl implements EmployeeDAO{

	@PersistenceUnit
	private EntityManagerFactory emf ;
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
	}//end of update()
	
	@Override
	public boolean deleteEmployee(int empId) {
		//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeePersistenceUnit");
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			EmployeeInfoBean employeeInfoBean= entityManager.find(EmployeeInfoBean.class, empId);
			entityManager.remove(employeeInfoBean);
			tx.commit();
			isDeleted = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close();
		return isDeleted;
	}// End of deleteEmployee()

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);
		
		List<EmployeeInfoBean> employeesList = null;
		try {
			employeesList = query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeesList;
		
	}// End of getAllEmployees()
	
}//end of class
