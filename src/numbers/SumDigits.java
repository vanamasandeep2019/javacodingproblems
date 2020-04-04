package numbers;

public class SumDigits {
	
	public static void main(String[] args) {
		
		int num=243;
		
		int sum=0;int digit=0;
		
		while(num>0){
			digit=num %10; //Extracting the last digit in an Integer
			sum=sum+digit; //0+4
			num=num/10;     //123
		}
		System.out.println("Sum of digits of number ="+sum);
		
	}
		
		

}
