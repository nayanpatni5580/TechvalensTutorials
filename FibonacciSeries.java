package com.techvalens.tutorials.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		 int number1=0,number2=1,number3,mainindex,total=15;    
		 System.out.print(number1+" "+number2);// for printing 0 and 1    
		    
		 for(mainindex=2;mainindex<total;++mainindex)
			 //loop starts from 2 because 0 and 1 are already printed    
		 {    
		  number3=number1+number2;    
		  System.out.print(" "+number3);    
		  number1=number2;    
		  number2=number3;    
		 }    
		  

	}

}
