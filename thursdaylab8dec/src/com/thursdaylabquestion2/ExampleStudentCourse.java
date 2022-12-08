package com.thursdaylabquestion2;
import java.util.*;
public class ExampleStudentCourse {

	public static void main(String[] args) {
// courses in the map
    TreeMap<Integer,String> Tm=new TreeMap<Integer,String>();
    Tm.put(01, "civil");
    Tm.put(02, "EEE");
    Tm.put(03, "mechanical");
    Tm.put(04, "ECE");
    Tm.put(05, "CSE");
   System.out.println("All courses in"+Tm);
   System.out.println("---------------------------------------------");
 // New tree map
   TreeMap<Integer,String> Tm1=new TreeMap<Integer,String>();
   Tm1.put(26, "Agriculture");
   Tm1.put(35,"mining");
   Tm1.put(28, "petrolium");
   Tm.putAll(Tm1);
  System.out.println("After copying:"+Tm);
  System.out.println("-------------------------");
 //Reversing the element
   System.out.println("Reversing the element"+Tm.descendingMap());
   System.out.println("---------------------------------------------------");
 //To get greatest key in tree set
   System.out.println("The Greatest key in Tree set is:"+Tm.firstEntry());
   System.out.println("-------------------------------------------------------");
 //To get last key in tree set
	System.out.println("The last key in tree set is:"+Tm.lastEntry());
	System.out.println("----------------------------------");
//To search a Value in tree map
	System.out.println("Searching a value:"+Tm.containsValue(26));
	System.out.println("------------------------------------");
//To Search a key in a tree set
    System.out.println("Searching key in set:"+Tm.containsKey(35));
    System.out.println("-------------------------------------");
//To remove and get a key-value mapping associated with the least key in a map.	
    System.out.println("to remove and get a key-value mapping associated with the least key in a map:"+Tm.pollLastEntry());
	System.out.println("------------------------------------");
//To remove and get a key-value mapping associated with the greatest key in this map
	System.out.println("To remove and get a key-value mapping associated with the greatest key in this map:"+Tm.pollFirstEntry());
	}

}
