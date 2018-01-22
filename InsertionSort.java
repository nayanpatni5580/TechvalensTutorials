package com.techvalens.tutorials.Arrays;
import java.util.*;
public class InsertionSort {  public static void  insertionSortingMethod(int array[])
							{   
							   for (int j = 1; j < array.length; j++) {  
									int key = array[j];  
									int i = j-1;  
								    while ( (i > -1) && ( array [i] > key ) ) 
								    {  
								        array [i+1] = array [i];  
								        i--;  
								    }  
								    array[i+1] = key;  
								}  
								}
//----------------------------------------main program-------------------------------------------------------------------------------------
		public static void main(String[] args) 
		{int i;
		int[] input = {9,14,3,2,6,25,58,176,554,43,11,58,22};    
        System.out.println("before sorting ---");    
        for(i=0;i<input.length;i++)
          System.out.print(input[i] +"  "); 
              
        insertionSortingMethod(array[]);//calling main methods
        System.out.println("**********************************************************************************************************");
        System.out.println("after sorting ---");    
        for(i=0;i<input.length;i++)
        	{System.out.println(input[i] +"  "); }
     }}
