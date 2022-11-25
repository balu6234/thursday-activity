package com.thursdaylabquestion2;
import java.util.*;
public class ExampleAccountBalanceTest {
	void Balancecheck(int Amount ) throws InsufficientBalanceException {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter Amount to withdraw:");
		   Amount=sc.nextInt();
		   int Balance=100;
		   if(Balance>Amount) {
			   throw new InsufficientBalanceException("Insufficient balance");
		   }
	      else 
	      {
		System.out.println("please take the Amount:"+Amount);
	}
}
	public static void main(String[] args) {
    ExampleAccountBalanceTest A=new ExampleAccountBalanceTest();
    try {
		  A.Balancecheck(00);
	  }
	  catch(InsufficientBalanceException e) {
		  System.out.println(e);
	  }
}
	}


