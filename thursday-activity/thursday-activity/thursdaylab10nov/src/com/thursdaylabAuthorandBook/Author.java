package com.thursdaylabAuthorandBook;

public class Author {
public String Authorname;
public  int age;

public Author()
{
  super();	
}
 public Author(String n,int age)
 {
	 this.Authorname=n;
	 this.age=age;
 }
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAuthorname() {
	return Authorname;
}
public void setAuthorname(String authorname) {
	Authorname = authorname;
}
public String toString() {
	return Authorname+"Age:"+age;
}
}
