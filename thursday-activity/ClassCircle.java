package com.classcircle;
class circle
{
	private float radius;
    private	float center;
	private static int count=0;
circle()
{
	System.out.println("constructor with instance variables");
}
 public circle(float radius,float center)
{
	this.radius=radius;
	this.center=center;
	count++;
}
 
public static void main(String[] args) {
	 circle c1=new circle(21.0F,22.9F);
	 circle c2=new circle(32.2F,50.2F);
	 System.out.println("circle c1:"+"center:"+c1.center+"radius:"+c1.radius);
	 System.out.println("circle c2:"+"center:"+c2.center+"radius:"+c2.radius);
     System.out.println("no of instance class circle is:"+circle.count);
}
}