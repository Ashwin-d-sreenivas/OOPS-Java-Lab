import java.util.Scanner;
import java.util.*;

class S_token{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter digits as string with space:");
		String s=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(s," ");
		int sum=0;
		
		while(st.hasMoreTokens()){
			String temp=st.nextToken();
			int n=Integer.parseInt(temp);
			sum+=n;
		}
		System.out.println("sum="+sum);
	}
}
		
		
