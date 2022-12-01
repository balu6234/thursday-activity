package com.thursdaylabquestion3;
import java.util.*;

public class BookStore {

	public static void main(String[] args) {
  ArrayList<Book>b=new ArrayList<Book>();
  b.add(new Book("wings of fire","apjabdul kaalam",100));
  b.add(new Book("python programing","balu",200));
  b.add(new Book("java programming","vanitha",300));
  System.out.println("the collection of books are");
  for(Book b1:b)
  {
	  System.out.println(b1.tittle+" "+b1.author+" "+b1.price);
	 
  }
  System.out.println("-------------------");
	System.out.println("Enter the book name");
	Scanner sc=new Scanner(System.in);
	String t=sc.next();
	for(Book b2:b)
	  {
		if(b2.tittle.contains(t)) {
			System.out.println("book available");
		  System.out.println(b2.tittle+" "+b2.author+" "+b2.price);
		 
	  }
		System.out.println("------------------");
		
	System.out.println("Enter the author name");	
		Scanner Sc=new Scanner(System.in);
		String au=sc.next();
		for(Book b3:b)
		  {
			if(b3.tittle.contains(au)) {
				System.out.println("book available");
			  System.out.println(b3.tittle+" "+b3.author+" "+b3.price);
	
	         }
		  }

        }
	  }
}
