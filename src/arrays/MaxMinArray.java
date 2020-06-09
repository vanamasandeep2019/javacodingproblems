package arrays;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int n,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		max=a[0];
		min=a[0];
		
		// Maximum logic
		for(int i=0;i<n;i++){
			// Compare each and every element in array with max if its greater
			//update max value
			if(a[i]>max){
				max=a[i];
			}
		}
		
		for(int i=0;i<n;i++){
			
			// Compare each and every element in array with min if its less than
						//update min value
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Maximum value="+max);
		System.out.println("Minimum value="+min);
	}

}
