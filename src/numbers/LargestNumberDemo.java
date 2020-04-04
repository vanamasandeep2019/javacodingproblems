package numbers;

import java.util.Scanner;

public class LargestNumberDemo {
	
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		 System.out.println("Enter the first number");
		 int num1=sc1.nextInt();
		 
		 System.out.println("Enter the Second number");
		 int num2=sc1.nextInt();
		 
		 System.out.println("Enter the third number");
		 int num3=sc1.nextInt();
		 
		 if(num1>num2 && num1 >num3)
		 {
			 System.out.println("First number is largest");
		 }else if(num2 >num3 && num2 >num1){
			 System.out.println("Second number is largest");
		 }else if(num3 >num1 && num3 >num2)
		 {
			 System.out.println("Third number is largest");
		 }else{
			 System.out.println("None of the elements are greater");
		 }
		
		
	}

}
