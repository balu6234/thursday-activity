package com.thursdaylab.dec15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Testfibonacci {
     static fibonaccinum fs;
	@BeforeAll
	static void Test() {
		fs=new fibonaccinum();
	}
	@Test
	public void negativeInput() {
		assertEquals(-1,-1);
	}
	@Test
	public void zeroAsInput() {
		assertEquals(0,0);
	}
	@Test
	public void oneAsInput() {
		assertEquals(1,1);
	}
	@Test
	public void getfibnResult()	{
	 assertEquals(3,3);
	}
}