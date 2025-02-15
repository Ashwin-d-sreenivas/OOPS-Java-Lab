import java.util.*;
import java.lang.Thread;

class Counter{
	int n=0;
	public synchronized void increment(){
		n++;
		System.out.println("count="+n);
	}
}

class A extends Thread{
	private Counter c;
	public A(Counter c){
		this.c=c;
	}
	public void run(){
		int i=0;
		int n=5;
		while(i<n){
			c.increment();
			i++;
			
		}
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			System.out.println("error");
		}
		
	}

}

class Sync extends Thread{

	


	public static void main(String[] args) throws InterruptedException{
		Counter cou=new Counter();
		A obj1=new A(cou);
		A obj2=new A(cou);
		obj1.start();
		obj2.start();
		
		obj1.join();
		obj2.join();
		
	}
}
