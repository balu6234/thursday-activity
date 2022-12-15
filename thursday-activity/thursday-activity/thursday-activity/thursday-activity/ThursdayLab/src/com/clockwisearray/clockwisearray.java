package com.clockwisearray;
import java.util.Arrays;
public class clockwisearray
{
   static int array[] = new int[]{1,2,3,4,5,6};
    
   static void rotate_array()
   {
      int a = array[array.length-1], i;
      for (i = array.length-1; i > 0; i--)
         array[i] = array[i-1];
      array[i] = a;
   }
    
  public static void main(String[] args) 
   {
       System.out.println("Original arraay:");
       System.out.println(Arrays.toString(array));
        
       rotate_array();
        
       System.out.println("Rotated arraay:");
       System.out.println(Arrays.toString(array));
   }
}