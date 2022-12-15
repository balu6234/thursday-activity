package com.studentdata;
import java.util.*;

public class Student {
	 private static final String Name =null;
	private static final String Age = null;
	private static final String Weight = null;
	static String name;
	 static int age;
	 static float weight;
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
		System.out.println("Student 1");
	    st1.getinfo();
    System.out.println("display information");
    System.out.println("Student 1");
    st1.displayInfo();
    System.out.println("My name is " + name + " and my age is " + age+"weight"+weight);
    System.out.println("count:"+count);   
	}

}
