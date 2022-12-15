package com.thursdaylabAuthorandBook;

public class Book {
private String Book;
private int publishedyear;
private float price;
private Author auth;

public Book()
{
	super();
}
public Book(String Book,int publishedyear,float price,Author auth) {
super();
this.Book=Book;
this.publishedyear=publishedyear;
this.price=price;
this.auth=auth;
}
public String getBook() {
	return Book;
}
public int getPublishedyear() {
	return publishedyear;
}
public float getPrice() {
	return price;
}
public void setBook(String book) {
	Book = book;
}
public void setPublishedyear(int publishedyear) {
	this.publishedyear = publishedyear;
}
public void setPrice(float price) {
	this.price = price;
}
public Author getauth()
{
	return auth;
	
}
 public void setauth()
 {
	 this.auth=auth;
 }
  
    
}
