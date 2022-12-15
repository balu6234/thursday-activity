package com.thursdaylab.dec15question2;

public class BusinessLogic {
       public double yearlysalary(Empdetails employeedetails) {
    	   double yearlysalary=employeedetails.getSalary();
    	   return yearlysalary;
       }
       public double appraisal(Empdetails employeedetails) {
    	   float appraisal=0;
    	   if(employeedetails.getSalary()<10000){
    		   appraisal=500;
    	   }
    	   else
    	   {
    		   appraisal=1000;
    	   }
    	   return appraisal;
       }
}
