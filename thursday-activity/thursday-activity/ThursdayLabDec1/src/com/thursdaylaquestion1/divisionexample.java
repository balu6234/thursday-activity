package com.thursdaylaquestion1;
import java.util.*;

public class divisionexample {
        public static int divide(int a,int b) 
        {
        	int p=0;
        	try
        	{
        		p=a/b;
        		System.out.println(p);
        	}
        	catch(ArithmeticException e)
        	{
        		System.out.println(e);
        	}
        	finally
        	{
        		
        	}
			return p;
        }
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int x=sc.nextInt();
    System.out.println("Enter the second number");
    int y=sc.nextInt();
    int result=divide(x,y);
    System.out.println(result);
    
    
    
   }
	}

  
	
