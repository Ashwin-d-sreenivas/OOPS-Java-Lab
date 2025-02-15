import java.util.Scanner;

public class Pal{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.next();
		int flag=1;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				flag=0;
				System.out.println("not a pal\n");
				break;
			}
		}
		if(flag==1){
			System.out.println("pal\n");
		}
	}
}
		
