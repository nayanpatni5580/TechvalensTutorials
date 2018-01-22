package com.techvalens.tutorials.Arrays;

public class AverageValue {
	// function to find sum n average
	static void printSumnAverage (int[] input_array)
	{
		  int sum = 0;
          
          for(int i=0; i < input_array.length ; i++)
          {			 sum = sum + input_array[i];							}
          System.out.println("Sum of the array elements is as follows -  " +sum);
          float average = sum /7;
          System.out.println("--------------------------------------------------------------");
          System.out.println("Average of the array elements is as follows -  " +average);
	}
//main program	
public static void main(String[] args) {
	int[] input_array= {23542+55+5255425+426545+252+5442+422};
	printSumnAverage(input_array);
	}}
