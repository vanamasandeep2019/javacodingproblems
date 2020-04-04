package arrays;

import java.util.Scanner;

public class ArraySum {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scanner.nextInt();
		int array[]=new int[size];
		int sum=0;
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++){
			array[i]=scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			sum=sum+array[i];
		}
		System.out.println("sum="+sum);
	}

}
