package com.thursdaylabAuthorandBook;

public class Bookdetails {
	static void display(Book b) {
		System.out.println("Book name:"+b.getBook());
		System.out.println("Author:"+b.getauth());
		System.out.println("published year:"+b.getPublishedyear());
		System.out.println("price of book is:"+b.getPrice());
		
	}

	public static void main(String[] args) {
   Book b=new Book("wings of fire",2021,107,new Author("Apj Abdul kalaam",21));
   display(b);
	}

}
