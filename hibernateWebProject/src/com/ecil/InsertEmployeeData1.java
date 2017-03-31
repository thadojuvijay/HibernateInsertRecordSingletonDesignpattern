package com.ecil;

import org.hibernate.Session;


public class InsertEmployeeData1


{
public void InsertEmployeeData1(Employee employee)
{
	 HibernateUtility.getSessionFactory();
	
	Session session = HibernateUtility.SessionFactory();
	
	
	session.beginTransaction();
	
	session.save(employee);
	session.getTransaction().commit();
	session.close();
	
}
}
