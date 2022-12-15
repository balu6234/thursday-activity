package com.thurdaylabshapes;

public class Triangle {
	public void draw(MainShape S)
	{
		System.out.println("the shapes is:"+S.getShape());
	}
 public void erase()
 {
	 System.out.println("erase shape");
 }
	public static void main(String[] args) {
   MainShape S=new MainShape("triangle");
   Triangle T=new Triangle();
   T.draw(S);
   T.erase();
	}

}
