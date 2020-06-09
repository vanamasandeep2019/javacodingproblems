package arrays;

public class LeftRotateArrayDemo {
	
	public static void main(String[] args) {
		
		int array[]={10,20,30,40};
		
		//Store the first element in the temp variable temp=10
		int temp=array[0];
		
		//Shift one element to the left
		for(int i=1;i<array.length;i++){
			array[i-1]=array[i];
		}
		
		//Store the temp value in the last position
		array[array.length-1]=temp;
		
		for (int i : array) {
			System.out.println(i);
		}
		
		
		
	}

}
