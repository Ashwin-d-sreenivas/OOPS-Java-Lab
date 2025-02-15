import java.util.*;
import java.lang.Thread;


class Fibon extends Thread{
	int n;
	public Fibon(int n){
		this.n=n;
	}
	
	public void run(){
		int num1=0; int num2=1; int num3;
		System.out.print("FIBONACCI SERIES= "+num1+" "+num2+" ");
		for(int i=2;i<n;i++){
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
	}
}

class Dis implements Runnable{
	int n;
	public Dis(int n){
		this.n=n;
	}
	
	public void run(){
		for(int i=0;i<n;i++){
			if(i%2==0){
				System.out.print("*");
			}
			else{
				System.out.print("+");
			}
		}
	}
}

class Fib{
	public static void main(String[] args){
		Fibon f=new Fibon(5);
		Dis d=new Dis(5);
		Thread t1=new Thread(d);
		
		f.start();
		t1.start();
	}
}

		
