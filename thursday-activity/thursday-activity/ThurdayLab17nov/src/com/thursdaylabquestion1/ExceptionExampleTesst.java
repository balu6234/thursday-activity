package com.thursdaylabquestion1;
import java.util.*;


public class ExceptionExampleTesst {
  void squarecheck(int a)throws OutofRangeException{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter  number :");
	a=sc.nextInt();
	  if (a>10 && a<50)
		  throw new OutofRangeException("invalid range");
	  else
		  throw new OutofRangeException("Square is"+a*a);
  }
  
  public static void main(String[] args) {
	  ExceptionExampleTesst ext=new ExceptionExampleTesst();
	  try {
		  ext.squarecheck(12);
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
  }
}
