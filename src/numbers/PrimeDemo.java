package numbers;

import java.util.Scanner;

public class PrimeDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to check whether it is prime or not");
		int n=scanner.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=true;
			}
			
		}
		if(!flag)
			System.out.println("Prime");
		else{
			System.out.println("Non Prime");
		}
		
		
		
	}

}
