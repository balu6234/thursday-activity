package com.thursdaylabquestion3;
import java.util.*;
public class product {
   void productcheck(int weight) throws MyException{
	   Scanner s= new Scanner(System.in);
	   if(weight<100) {
		   throw new MyException("invalid product");
	   }
	   else 
	   {
        throw(new MyException("weight of product is:"+weight));
	   }
   }
	public static void main(String[] args) {
		{
			product P = new product();
			try
			{
				P.productcheck(10);
			}
			catch(MyException e)
			{
				System.out.println("catch Exception"+e);
			}
		}
	}

}
