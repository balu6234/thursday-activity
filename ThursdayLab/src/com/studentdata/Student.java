package com.studentdata;
import java.util.*;

public class Student {
	 private static final String Name =null;
	private static final String Age = null;
	private static final String Weight = null;
	static String name;
	  int age;
	  float weight;
	public static int count=0;
	public Student() {
		count++;
	}
 public void getinfo()
 {
	 System.out.println("enter student name");
	 this.name =new Scanner(System.in).next();
	 System.out.println("enter student age");
	 this.age =new Scanner(System.in).nextInt();
	 System.out.println("enter student weight in kg");
	 this.weight = new Scanner(System.in).nextFloat();
 }
 public void displayInfo()
 {
	 System.out.println("Name:" +this.name);
	 System.out.println("Age:" +this.age);
	 System.out.println("Weight:" +this.weight);
 }
public int getcount(){
	return Student.count;
}
	public static void main(String[] args) {
		Student st1 =new Student();
		Student st2 = new Student();
	    st1.getinfo();
	    st2.getinfo();
		System.out.println("Student 1");
		System.out.println("Student 2");
    System.out.println("display information");
    st1.displayInfo();
    st2.displayInfo();
    System.out.println("student1 st1:"+"My name is " +st1.name + " and my age is " +st1.age+"weight"+st1.weight);
    System.out.println("student2 st2:"+"My name is " +st2.name + " and my age is " +st2.age+"weight"+st2.weight);

    System.out.println("count:"+Student.count);   
	}

}
