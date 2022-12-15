package com.thurdaylabshapes;

public class Square {
	public void draw(MainShape S)
	{
		System.out.println("the shapes is:"+S.getShape());
	}
 public void erase()
 {
	 System.out.println("erase shape");
 }
	public static void main(String[] args) {
   MainShape S=new MainShape("Square");
   Square s1=new Square();
   s1.draw(S);
   s1.erase();
	}

}
