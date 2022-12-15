package com.thursdaylab.dec15question3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
public class TestCalculator {
   static Calculator ca;
   
   
    @BeforeAll
    static void Test() {
    	ca=new Calculator();
    }
    @Test
    void Addition() {
    	int expected=20;
    	int actual=ca.addition(10,10);
    	assertEquals(expected,actual);
}
    @Test
    void substraction() {
    	int expected=20;
    	int actual=ca.substraction(30,10);
    	assertEquals(expected,actual);
}
    @Test
    void multiplication() {
    	int expected=20;
    	int actual=ca.multiplication(2,10);
    	assertEquals(expected,actual);
}@Test
    void division() {
    	int expected=5;
    	int actual=ca.division(20,4);
    	assertEquals(expected,actual);
}
}
