package com.techvalens.tutorials.Arrays;

public class BubbleSort {
	
static void bubbleSort(int input_array[]) {
	int number = input_array.length;
	int temp=0;
	for(int mainindex=0; mainindex < number; mainindex++)
	{  
        for(int secondryindex=1; secondryindex < (number-mainindex); secondryindex++)
        {  
                 if(input_array[secondryindex-1] > input_array[secondryindex])
                 {  
                        //swap the elements  
                        temp = input_array[secondryindex-1];  
                        input_array[secondryindex-1] = input_array[secondryindex];  
                        input_array[secondryindex] = temp;  
                }  
                 
        }  
	}  
											}



	public static void main(String[] args)
	{
		int input_array[] ={3,60,35,2,45,320,5};  
	
     System.out.println("before bubble sort");  
     for(int mainindex=0; mainindex < input_array.length; mainindex++)
         {  System.out.print(input_array[mainindex] + " ");  
         }   System.out.println();  
           
         bubbleSort(input_array);
         //sorting array elements using bubble sort  
         System.out.print("***********************************************");
         System.out.print("***********************************************");
         System.out.print("***********************************************");
          
         System.out.println("after bubble sort");  
         for(int mainindex=0; mainindex < input_array.length; mainindex++)
         {  
                 System.out.print(input_array[mainindex] + " ");  
         }  

 }  }


