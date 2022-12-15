package com.thursdaylab8decquestion1;
import java.util.*;

class ExampleTreeset {

	public static void main(String[] args) {
    TreeSet<String> ts=new TreeSet<String>();
    ts.add("red");
    ts.add("blue");
    ts.add("green");
    ts.add("yellow");
    ts.add("pink");
    //all colors in set
    System.out.println("All colors in Tree Set is:" +ts);
    System.out.println("-------------------------------------------------");
    //adding new tree set
    TreeSet<String> ts1=new TreeSet<String>();
    ts1.add("orange");
    ts1.add("grey");
    ts.addAll(ts1);
    System.out.println("After adding new Tree Set is:"+ ts);
    System.out.println("----------------------------------------------------");
    //printing reverse order
    System.out.println("reverse order of the set is:" +ts.descendingSet());
    System.out.println("----------------------------------------------------");
    //getting first element in tree set
    System.out.println("the first element in the TreeSet is:"+ts.first());
    System.out.println("---------------------------------------------------");
    //getting last element in tree set
    System.out.println("the last element in the TreeSet is:"+ts.last());
    System.out.println("------------------------------------------------------");
    //comparing the two sets
    ts.equals(ts1);
    System.out.println("After comparing two sets:"+ts.equals(ts1));
    System.out.println("-------------------------------------------------------");
	}

}
