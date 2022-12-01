package com.thursdaylabquestion3;
import java.util.*;  
import java.util.regex.*;

public class Password {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Create your Password:");
     String Password = sc.next();
     String regex= "A-Za-z0-9@$#& ,{8}";
     Pattern pattern=Pattern.compile(Password);
     Matcher matcher=pattern.matcher(regex);
     boolean matchfound=matcher.find();
     if(matchfound=true)
     {
    	 System.out.println("Password generated ");
 
     }
     else if(matchfound)
    	 System.out.println("Invalid password");
	}
}