package com.transposematrix;
public class TransposeMatrix{  
public static void main(String args[]){  
int matrix1[][]={{1,3,4},{2,4,3},{3,4,5}};    
int dup[][]=new int[3][3];  
    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
dup[i][j]=matrix1[j][i];  
}    
}    
  
System.out.println("Matrix before transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(matrix1[i][j]+" ");    
}    
System.out.println();  
}    
System.out.println("Matrix After Transpose:");  
for(int i=0;i<3;i++) {    
for(int j=0;j<3;j++) {    
System.out.print(dup[i][j]+" ");    
}    
System.out.println();   
}    
}}  
