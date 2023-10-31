package com.demo.hibernatebank;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.hibernatebank.config.HibernateUtility;
import com.demo.hibernatebank.entities.Account;
import com.demo.hibernatebank.entities.Users;


public class App {
  public static void main(String[] args) {
	  SessionFactory sessionFactory=HibernateUtility.getSessionFactoryObject();
	  Scanner sc = new Scanner(System.in);
	  while(true) {
		  System.out.println("Select a option:");
		  System.out.println("1.Register user");
		  System.out.println("2.Deposit amount");
		  System.out.println("3.Check balance");
		  System.out.println("4.Remove user account");
		  System.out.println("5.Exit...");
		  int option = sc.nextInt();
		  if(option==5) {
			  System.out.println("Thank you!!");
			  break;
		  }
		  switch(option) {
		  case 1:{
			  Session session=sessionFactory.openSession();
			  Users userObj=new Users("pass1","Sowmini","Chennai");
			  Account accObj=new Account(0);
			  Transaction trnx=session.beginTransaction();
			  accObj.setUser(userObj);
			  session.persist(accObj);
			  session.persist(userObj);
			  trnx.commit();
			  session.close();
			  System.out.println(userObj);
			  break;
		  }
		  case 2:{
			  Session session=sessionFactory.openSession();
			  System.out.println("Enter accountid: ");
			  int accountid = sc.nextInt();
			  System.out.println("Enter deposit amount: ");
			  int balance = sc.nextInt();
			  Account accObj=session.get(Account.class, accountid);
			  if(accObj!=null) {
				  int total=accObj.getBalance()+balance;
				  accObj.setBalance(total);
				  Transaction trnx=session.beginTransaction();
				  session.update(accObj);
				  trnx.commit();
				  
				  System.out.println(accObj);
			  }
			  else
				  System.out.println("Account id doesn't exist");
			  session.close();
			  break;
		  }
		  case 3:{
			  System.out.println("Enter account number: ");
			  int accountid = sc.nextInt();
			  Session session=sessionFactory.openSession();
			  Query query= session.createNativeQuery("select userid,balance from account where accountid=?1");
			  query.setParameter(1, accountid);
			  List<Object[]> account=query.getResultList();
			  if(account.size()!=0) {
				  for(Object[] a:account) {
					  //System.out.println(a[0]);
					  System.out.println("Current account balance for userid "+a[0]+" is "+ a[1]);
				  }
			  }
			  else
				  System.out.println("Account id doesn't exist");
			  session.close();
			  break;
		  }
		  case 4:{
			  System.out.println("Enter user id to remove user from bank");
			  int userid = sc.nextInt();
			  Session session=sessionFactory.openSession();
			  Account accObj=session.get(Account.class, userid);
			  if(accObj!=null) {
				  Transaction trnx=session.beginTransaction();
				  session.delete(accObj);
				  trnx.commit();
				  Users userObj=session.get(Users.class, userid);
				  Transaction trnx1=session.beginTransaction();
				  session.delete(userObj);
				  trnx1.commit();
				  System.out.println("User removed from bank");
			  }
			  else
				  System.out.println("User id doesn't exist");
			  session.close();
		  }
		  }
	  }
  }
}
