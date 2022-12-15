package com.thursdaylab.dec15question3;

public class Calculator {
    public int addition(int x,int y) {
		return x+y;
    	 
     }
    public int substraction(int x,int y) {
    	 return x-y;
     }
    public int multiplication(int x,int y)
     {
		return x*y;
    	 
     }
   public int division(int x,int y) {
    	 try {
    		 if(y==0)
    			 throw new IllegalArgumentException("denominator not be zero");
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
		return x/y;
    	 
     }
}
