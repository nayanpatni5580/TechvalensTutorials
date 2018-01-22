package com.techvalens.tutorials.Arrays;

public class RotateArray {
	
	//Looping code to rotating function
	void rotate(int input_array[], int distance, int number)
	{int mainindex;
	for(mainindex=0; mainindex<distance; mainindex++)
	{
		
		leftRotate(input_array,number);
	}
	}
	
	void leftRotate(int input_array[],int number)
	{
		int mainindex,temp;
		temp=input_array[0];
		for(mainindex=0;mainindex<number-1;mainindex++)
			{
			input_array[mainindex]=input_array[mainindex+1];
			input_array[mainindex]=temp;
			
			}
	}
	//function to print array
	void printArrary(int input_array[],int size)
	{
		int mainindex;
		for(mainindex=0;mainindex<size;mainindex++)
		{
			System.out.print(input_array[mainindex] +"  ");
		}
		
	}
	//main code 
	public static void main(String[] args)
	{
		RotateArray rotate = new RotateArray();
		int input_array[] = {1, 2, 3, 4, 5, 6, 7};
	//	rotate.leftRotate( input_array, 5, 7);
	//	rotate.printArrary( input_array, 7);

	}

}
