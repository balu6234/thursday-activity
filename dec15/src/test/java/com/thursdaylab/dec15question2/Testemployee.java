package com.thursdaylab.dec15question2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Testemployee {
     static Empdetails emp;
     static BusinessLogic ebp;
     
    @BeforeAll
    static void setup() {
    	emp=new Empdetails();
    	ebp=new BusinessLogic();
    }
 
	@Test()
    void Testyearlysalary() {
    	emp.setEmpname("balu");
    	emp.setAge(23);
    	emp.setSalary(12000);
    	double salary =ebp.yearlysalary(emp);
        assertEquals(12000,salary);
    }
	@Test
	void TestAppraisal() {
		emp.setEmpname("balu");
		emp.setAge(23);
		emp.setSalary(10000);
		double appraisal=ebp.appraisal(emp);
		assertEquals(1000,appraisal);
	}
}