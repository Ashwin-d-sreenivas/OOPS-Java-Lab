import java.util.*;

class gt{
	public void display(){
		System.out.println("garbage will be collected");
	}
	public void finalize(){
		System.out.println("garbage collected\n");
	}
}

class Garbage{
	public static void main(String[] args){
		gt ob=new gt();
		gt ob2=new gt();
		ob.display();
		ob2.display();
		ob=null;
		System.gc();
	}
}
