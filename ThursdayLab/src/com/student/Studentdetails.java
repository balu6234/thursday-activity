package com.student;
abstract class Student
{
	private String name;
	public int age;
	protected int id;
	double grade;
	Student(String n,int a,int i)
	{
		name=n;
		age=a;
		id=i;
	}
	void displayinfo()
	{
		System.out.println("Student details:"+name+","+age+","+id);
	}
	abstract Boolean isPassed(double grade);
}
class Grad extends Student
{
Grad(String n,int a,int i)
{
	super(n,a,i);
}

	Boolean isPassed(double grade)
	{
		if(grade>=80)
		{
			
			return true;
			
			
		}
		else
		{
			
			return false;
		}
	}
}
final class Undgrad extends Student
{
	Undgrad(String n,int a,int i)
	{
		super(n,a,i);
	}
	Boolean isPassed(double grade)
	{
		if(grade>=70)
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
	}
}
public class Studentdetails {

	public static void main(String[] args) {
		Grad g=new Grad("balu",25,1546);
		g.displayinfo();
		System.out.println("result of grade student is:"+g.isPassed(85));
		Undgrad ug=new Undgrad("balu",22,1548);
		ug.displayinfo();
		System.out.println("result of undergrad student:"+ug.isPassed(55));
		
		
	}

}