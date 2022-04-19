package week1.day2.Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {


	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array
		Arrays.sort(arr);   

		int len=arr.length;
		int sum =(len+1)*(len+2)/2;
		for(int i=0;i<len; i++) {

			sum=sum-arr[i];
		}					
		System.out.println("missing Elemet is "+sum);


	}


}

