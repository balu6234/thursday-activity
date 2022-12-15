package com.cubenumber;
import java.util.*;

public class cubenumber {

	public static void main(String[] args) {
		int n;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of terms:");
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
		result=i*i*i;
	   System.out.println("number is"+i+" cube of"+i+"is:"+result);
	}

}
}