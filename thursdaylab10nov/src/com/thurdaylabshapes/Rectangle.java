package com.thurdaylabshapes;

public class Rectangle {
public void draw(MainShape S)
{
	System.out.println("the shape is:"+S.getShape());
	
}
 public void erase()
 {
	 System.out.println("the shape erase");
 }
	public static void main(String[] args) {
		MainShape S=new MainShape("Rectangle");
		Rectangle R =new Rectangle();
		R.draw(S);
		R.erase();
		
	}

}
