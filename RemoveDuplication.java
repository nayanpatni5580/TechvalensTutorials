package com.techvalens.tutorials.Arrays;

public class RemoveDuplication {
	public static int removeDuplicateElements(int input[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (input[i] != input[i+1]){  
                temp[j++] = input[i];  
            }  
         }  
        temp[j++] = input[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            input[i] = temp[i];  
        }  
        return j;  }

	public static void main(String[] args) {
		int input[] = {1,5,9,7,4,3,6,8,5};  
        int length = input.length;  
        length = removeDuplicateElements(input, length);  
          for (int i=0; i<length; i++)  
           System.out.print(input[i]+" ");  }  }