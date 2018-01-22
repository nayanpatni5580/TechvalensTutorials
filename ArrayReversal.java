package com.techvalens.tutorials.Arrays;

public class ArrayReversal
{

// function to reverse
static void revereseArray(int input[], int start, int end)
{
    int temp;
    if (start >= end)
    {    return;}
    temp = input[start];
    input[start] = input[end];
    input[end] = temp;
    revereseArray(input, start+1, end-1);
}
//printing function
static void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        System.out.print(arr[i] + " ");
    System.out.println("");
}
//main code
	public static void main(String[] args) {
	int input[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	 printArray(input, 15);
     revereseArray(input, 0, 14);
     System.out.println("*******************************************************************");
     System.out.println("*******************************************************************");
     System.out.println("*******************************************************************");
      System.out.println("Reversed array is ");
     printArray(input, 15);
	}
}
