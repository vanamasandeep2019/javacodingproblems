package arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		String str="12345";
		char ch[]=str.toCharArray();
		int l=0;
		int r=ch.length-1;
		String n="";
		while(l<=r){
			if(l==r){
				n=n+ch[l];
			}else
			{
				n= n+ch[l];
				n= n+ch[r];
				l++;
				r--;
			}
			
		}
		System.out.println(n);
	}

}
