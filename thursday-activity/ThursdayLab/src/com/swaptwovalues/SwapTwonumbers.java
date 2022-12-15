package com.swaptwovalues;
import java.util.*;
public class SwapTwonumbers {
	int a,b;
	int temp;
 public void SwapTwonumber(SwapTwonumbers STN)
 {
	  temp=STN.a;
	 STN.a=b;
	 STN.b=temp;
 }

	public static void main(String[] args) {
		SwapTwonumbers stw=new SwapTwonumbers();
		Scanner Sc =new Scanner(System.in);
		System.out.println("enter the first number:");
		stw.a = Sc.nextInt();
		System.out.println("enter the second number:");
		stw.b = Sc.nextInt();
		stw.SwapTwonumber(stw);
		System.out.println("After Swapping: a=" +stw.a+ "b=" + stw.b );
	}

	

}
