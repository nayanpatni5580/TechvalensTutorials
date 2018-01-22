package com.techvalens.tutorials.Arrays;

public class LinearSearch {
	 // Returns number of times the number occurrences in input[0..n-1]
    static int countOccurrences(int input[], int times, int number)
    {
        int res = 0;
        for (int i=0; i<times; i++)
            if (number == input[i])
              res++;
        return res;
    }
     
    public static void main(String args[])
    {
        int input[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int times = input.length;
        int number = 2;
        System.out.println(countOccurrences(input, times, number));
    }

}
