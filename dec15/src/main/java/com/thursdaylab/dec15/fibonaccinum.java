package com.thursdaylab.dec15;

public class fibonaccinum {
  public int fibn(int n) {
	int a=0;
	int b=1;
	for(int i=2;i<=10;i++) {
		a=b;
		b=n;
		n=a+b;
	}
	return n;
  }
}

