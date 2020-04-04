package arrays;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		Integer num=18921;
	String s=String.valueOf(num);
	
	char[] ch1=s.toCharArray();
	char[] ch2=s.toCharArray();
	
	String temp="";
	for(int i=0,j=ch2.length-1; (i< ch1.length) && j>0 ;i++,j--)
	{
		if(ch1[i]!=ch2[j]){
		temp=temp+ch1[i];
		temp=temp+ch2[j];
		
		}else{
			temp=temp+ch1[i];
			break;
		}
	}
	System.out.println(temp);
		
	}

}
