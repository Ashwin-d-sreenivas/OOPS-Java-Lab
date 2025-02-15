import java.util.Scanner;
import java.io.*;



class P{
	public static void main(String[] args) throws IOException{
		try{
		
			FileWriter fw=new FileWriter("pali.txt");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter:");
			String temp=sc.next();
			
			int flag=1;
			for(int i=0;i<temp.length();i++){
				if(temp.charAt(i)!=temp.charAt(temp.length()-1-i)){
					flag=0;
					break;
				}
			}
			
			if(flag==1){
				for(int i=0;i<temp.length();i++){
					fw.write(temp.charAt(i));
				}
			}
			fw.close();
		}
		catch(IOException e){
			System.out.print("error");
		}
	}
}
