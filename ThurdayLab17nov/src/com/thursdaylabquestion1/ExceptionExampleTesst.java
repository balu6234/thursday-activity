package com.thursdaylabquestion1;
import java.util.*;
public class ExceptionExampleTesst {
  void squarecheck(int a)throws OutofRangeException{
	  Scanner sc=new Scanner(System.in);
	  a=a*a;
	  if(a<10 && a>50){
		  throw new OutofRangeException("Out of Range");
	  }
	  else
	  {
		  throw(new OutofRangeException("Square is"+a));
	  }
  }
public static void main(String[] args) {
	{
		ExceptionExampleTesst ext=new ExceptionExampleTesst();
		try
		{
			ext.squarecheck(1);
		}
		catch(OutofRangeException e)
		{
			System.out.println(e);
		}
		}
	}
}
