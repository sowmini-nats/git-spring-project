package com.demo.hibernatedemo;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
import com.demo.hibernatedemo.config.HibernateUtility;
import com.demo.hibernatedemo.entities.Address;
import com.demo.hibernatedemo.entities.Employee;
 
public class App6 {
 
	public static void main(String[] args) {
		 SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		 Address addObj=new Address("Chennai","India");
		 Employee empObj=new Employee("Reeta", 25000);
		 Transaction trnx=session.beginTransaction();
		 empObj.setEmpAddress(addObj);
		 session.persist(addObj);
		 session.persist(empObj);
		 trnx.commit();
		 session.close();
		 System.out.println(empObj);
		
	}
 
}