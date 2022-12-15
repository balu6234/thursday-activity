package com.thursdaylabquestion1;
import java.util.*;

public class FruitCollectioArrayList {

	public static void main(String[] args) {
  ArrayList<String> al=new ArrayList<String>();
  al.add("Apple");
  al.add("Orange");
  al.add("WaterMelon");
  al.add("Banana");
  al.add("Strawberry");
  System.out.println("Fruits in the basket is :"+al);
  //Adding New Fruits In Basket
  System.out.println("-----------------");
  ArrayList<String> al1=new ArrayList<String>();
  al1.addAll(al);
  al1.add("Kiwi");
  al1.add("Dragon Fruit");
  System.out.println("After adding new Fruits is:"+al1);
  //Removing Fruits In Basket
  System.out.println("------------------");
  al.remove(al1);
  System.out.println("After Removing"+al);
  System.out.println("------------------");
  //Replacing Fruits In Basket
  al.set(3, "Moosambi");
  System.out.println("After Replacing:"+al);
	}

}
