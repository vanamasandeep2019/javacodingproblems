package arrays;

//O(n2)
public class LeaderElement {

	public static void main(String[] args) {
		
		int array[] ={2,5,7,9,4,3,1};
		
		for(int i=0;i<array.length;i++){
			boolean flag=false;
			for(int j=i+1;j<array.length;j++){
				if(array[i]<=array[j]){
					flag=true;
					break;
				}
			}
			if(flag==false){
				System.out.println("Flag value="+array[i]);
			}
			
		}

	}

}
