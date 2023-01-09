package com.librarymgmysystem.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarymgmysystem.dao.Bookdao;
import com.librarymgmysystem.dao.Librarydao;
import com.librarymgmysystem.entity.Book;
import com.librarymgmysystem.entity.Library;

public class serviceMain {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
Bookdao bdao=(Bookdao) context.getBean("Bookdao");
Book b1=new Book(1,"java","satwik");
Book b2=new Book(2,"python","swarna");
Book b3=new Book(3,"C language","prince");
Book b4=new Book(4,"c++","glory");

bdao.insertBook(b1);
bdao.insertBook(b2);
bdao.insertBook(b3);
bdao.insertBook(b4);

Librarydao libdao=(Librarydao) context.getBean("Librarydao");
Library l1=new Library(1,"college",b1);
Library l2=new Library(2,"student",b2);
Library l3=new Library(1,"college",b3);
Library l4=new Library(2,"college",b4);

libdao.insertLibrary(l1);
libdao.insertLibrary(l2);

	}

}
