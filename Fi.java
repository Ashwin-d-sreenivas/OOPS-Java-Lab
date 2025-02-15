import java.util.Scanner;
import java.io.*;

class Fi{
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		FileWriter fw=new FileWriter("input.txt");
		System.out.println("enter stirng:");
		String temp=sc.nextLine();
		fw.write(temp);
		fw.close();
		FileReader fr=new FileReader("input.txt");
		FileWriter fw2=new FileWriter("output.txt");
		
		int ch;
		while((ch=fr.read())!=-1){
			fw2.write((char)ch);
		}
		fr.close();
		fw2.close();
	}
}

//for(int i=0;i<temp.length();i++){
	//		fw.write(temp.charAt(i));
	//	}
