package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int target=50;
		int arr[]={10,20,30,40,50};
		Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
	        for (int i = 0; i < arr.length-1; i++) {
	            // Check if number is already in hashmap
	        	if(set.contains(target-arr[i])){
	        		System.out.println(arr[i]);
	        		System.out.println(target-arr[i]);
	        	}
	        }
	        
	    }
		
		
		/*for(int i=0;i<=array.length-1;i++){
			for(int j=1;j<=i;j++)
			{
				if(array[i]+array[j]==90){
					System.out.println(array[i]);
					System.out.println(array[j]);
				}
			}
		}*/
		
		

}
