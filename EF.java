import java.util.Scanner;
import java.io.*;

class Exp{
	public void test(int n) throws IOException,ArithmeticException{
		try{
			FileWriter fw=new FileWriter("o.txt");
			
			if(n%2==0){
				fw.write(n+" ");
				fw.close();
			}
			else{
				throw new ArithmeticException("bcoz");
			}
		}
		catch(ArithmeticException e){
			System.out.println("error throwed");
		}
		catch(IOException e){
			System.out.println("error ");
		}
		
	}
}
class EF{
	public static void main(String[] args){
		try{
			Exp e=new Exp();
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			e.test(n);
		}
		catch(IOException e){
			System.out.println("error thrwo");
		}
		catch(ArithmeticException e){
			System.out.println("error thrwo");
		}
	}	
}	
		
		
		
		
		
		
		
		
		
		
		
