package com.Studentmanagement.student;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentMain {

	public static void main(String[] args) {
		Configuration  cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		//Session session = factory.openSession();
  Session session=factory.openSession();
  session.beginTransaction();
  Student st=new Student();
  st.setRoll_no(1);
  st.setName("balu");
  st.setCity("ongole");
  st.setContact(123456789);
  
  Student st1=new Student(2, "neela rao", "hyderabad", 2345678);
  Student st2=new Student(3, "bunny", "dubai", 345678);
  Student st3=new Student(4, "sowmya", "ananthapur", 45678);
  Student st4=new Student(5, "anu", "banglore", 5678);
  
  session.save(st4);
  session.save(st3);
  session.save(st2);
  session.save(st1);
  session.save(st);
  session.getTransaction().commit();
  
            int num;
       Scanner sc=new Scanner(System.in); 
       num=sc.nextInt();
       System.out.println("enter the number");
       switch(num) {
       case 1:  Query query1=session.createQuery("from Student");
       List list=query1.list();
       System.out.println(list);
      
       
      case 2: session.beginTransaction();
      Query query2=session.createQuery("update Student set Stud_name='megha' where id='2'");
      int list2=query2.executeUpdate();
      System.out.println("rows are updated"+list2);
      session.getTransaction().commit();
      
     case 3:
    	 int studnum;
    	System.out.println("enter roll number");
    	studnum=sc.nextInt();
    	Query query3=session.createQuery("delete from Student where id="+studnum);
    	int list3=query3.executeUpdate();
    	session.getTransaction().commit();
    	
     case 4:
    	 int studrno;
    	 System.out.println("enter roll number");
     	studrno=sc.nextInt();
     	Query query4=session.createQuery("delete from Student where id="+studrno);
     	int list4=query4.executeUpdate();
     	session.getTransaction().commit();
     	
    	 
	}
      
}
}