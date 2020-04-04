package numbers;

import java.util.Scanner;

public class SumDemo {
	
	public static void main(String[] args) {
		
		int n,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("Sum="+sum);
	}

}
