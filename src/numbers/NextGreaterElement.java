package numbers;

public class NextGreaterElement 
{  
	public static void main(String[] args) {
		
		int arr[]={1,20,15,11};
		
		int next,i,j;
		
		for(i=0;i<arr.length;i++){
			next=-1;
			for(j=i+1;j<arr.length;j++){
				
				if(arr[i]<arr[j]){
					next=arr[j];
					break;
				}
				
			}
			System.out.println(arr[i]+"------"+next);
		}
		
		
		
	}
} 
