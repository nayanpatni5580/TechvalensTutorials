package com.techvalens.tutorials.Arrays;
public class SmallestElement {
public static int smallestElement(int smallest[],int total)//main method
{int temporary;
int i;
for ( i = 0; i < total; i++)   
{  
    for (int j = i + 1; j < total; j++)   
    {  
        if (smallest[i] > smallest[j])   
        {  
            temporary = smallest[i];  
            smallest[i] = smallest[j];  
            smallest[j] = temporary;  
        }  
    } 
}  
return smallest[0];  
}
	@SuppressWarnings("unused")
	public static void main(String[] args) {//main program
	int[] input = {64,9552,64,5646,456,5456,54232,6321,02,223,412,51,5,6,0656};
	System.out.println("Given array elements are as follows-----");
	int i;
	//for(i=0;i<input.length;i++)
	//{
	//System.out.println(input[i] [" "]+);
	//}
	System.out.println("Smallest no is---: "+smallestElement(input,15));
	}}
