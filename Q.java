import java.util.*;
import java.io.*;


class Q{
	public static void main(String[] args) throws IOException {
		try{
		FileReader fr=new FileReader("howahowa.txt");
		Scanner sc=new Scanner(fr);
		int ch;
		while(sc.hasNextLine()){
			String temp=sc.nextLine();
			ch=Integer.parseInt(temp);
			System.out.println(ch);
			
			if(ch>0){
				throw new ArithmeticException("demo");
			}
		}
		}catch(ArithmeticException e){
			System.out.print("positive");
		}
		catch(IOException e){
			System.out.println("error");
		}
	}
}
		
