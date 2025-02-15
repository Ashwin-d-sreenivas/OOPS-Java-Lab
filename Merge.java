import java.util.*;
import java.io.*;

class Merge{
	public static void  main(String[] args) throws IOException{
		FileReader fr1=new FileReader("i1.txt");
		FileReader fr2=new FileReader("i2.txt");
		FileWriter fw=new FileWriter("out.txt");
		
		int temp,temp2;
		while((temp=fr1.read())!=-1 && (temp2=fr2.read())!=-1){
			while(temp!='\n' && temp!=-1){
				fw.write((char)temp);
				temp=fr1.read();
			}
			fw.write('\n');
			StringBuffer bf=new StringBuffer();
			while(temp2!='\n' && temp2!=-1){
				bf.append((char)temp2);
				temp2=fr2.read();
			}
			bf.reverse();
			fw.write(bf.toString());
			fw.write('\n');
			
			
		}
		
		while((temp=fr1.read())!=-1){
			fw.write((char)temp);
		}
		while((temp2=fr2.read())!=-1){
			StringBuffer bf=new StringBuffer();
			while(temp2!='\n' && temp2!=-1){
				bf.append((char)temp2);
				temp2=fr2.read();
			}
			bf.reverse();
			fw.write(bf.toString());
			fw.write('\n');
		}
		fr1.close();
		fr2.close();
		fw.close();
	}
}
