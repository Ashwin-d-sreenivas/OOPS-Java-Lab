import java.util.Scanner;

public class Freq{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		
		System.out.println("enter the character to count");
		char ch=sc.next().charAt(0);
		
		int count=0;
		for(int i=0;i<str.length();i++){
			if(ch==str.charAt(i)){
				count++;
			}
		}
		System.out.println("freq="+count);
	}
}
