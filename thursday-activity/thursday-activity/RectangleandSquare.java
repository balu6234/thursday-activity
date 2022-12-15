package com.Rectangle;
class Rectangle
{
	int length=30;
	int breadth=40;
	
	void printThearea()
	{
		System.out.println("area of rectangle:"+length*breadth);
	}

    void printTheperimeter()
    {
    System.out.println("perimeter of the rectangle:"+2*(length*breadth));
    }
}
 class Square extends Rectangle
 {
	 int side=5;
	 int side1=6;
	 int side2=7;
	 Square()
	 {
		 super();
	 }
	 void display()
	 {
		 System.out.println("area of square:" +side1*side2);
		 System.out.println("perimeter of rectangle:"+4*side);
	 }
class RectangleandSquare {

	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.printThearea();
		r.printTheperimeter();
		Square S=new Square();
		S.display();
	}
}
    }

