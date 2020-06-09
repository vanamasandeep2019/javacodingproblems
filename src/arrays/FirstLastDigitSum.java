package arrays;

import java.util.Scanner;

public class FirstLastDigitSum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		//Last Digit we use % operator
		int lastDigit=number%10;
		
		int firstDigit=number;
		while(firstDigit>=10){
			firstDigit=firstDigit/10;
		}
		System.out.println("First Digit="+firstDigit);
		System.out.println("Last Digit="+lastDigit);
		System.out.println("Sum="+(firstDigit+lastDigit));
	}

}
