package numbers;

import java.util.Scanner;

public class ReverseNumberDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int n=sc.nextInt();
		int reverse=0;
		while(n!=0){
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		System.out.println("Reverse number="+reverse);
		
		 


		
	}

}
