import java.util.Scanner;

public class Ex{
	
	
	static void display(int[] arr,int a) throws ArrayIndexOutOfBoundsException{
		System.out.println(arr[a]);
	}	
	
	public static void main(String[] args){
		try{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter A=");
			int a=sc.nextInt();
			System.out.println("enter B=");
			int b=sc.nextInt();
			
			int res=a/b;
			System.out.println(res);
			
			int[] arr=new int[5];
			display(arr,a);
		}
		catch(ArithmeticException e){
			System.out.println("/ by zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array index exceed");
		}
	}
}
			
