import java.util.Random;
import java.lang.Thread;


class Randomg implements Runnable{
	public void run(){
		Random r=new Random();
		int i=0;
		int n=10;
		while(i<n){
			int rand=r.nextInt(20);
			
			if(rand%2==0){
				Square sq=new Square(rand);
				Thread t2=new Thread(sq);
				t2.start();
			}
		
			else{
				Cube cb=new Cube(rand);
				Thread t1=new Thread(cb);
				t1.start();
			}
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.print("error");
			}
			i++;
		}
	}
}

class Square implements Runnable{
	int num;
	public Square(int num){
		this.num=num;
	}
	public void run(){
		System.out.println("Square of num"+num+"="+(num*num));
	}
}

class Cube implements Runnable{
	int num;
	public Cube(int num){
		this.num=num;
	}
	public void run(){
		System.out.println("Cube of num"+num+"="+(num*num*num));
	}
}


class Thr{
	public static void main(String[] args){
		Randomg obj=new Randomg();
		Thread t=new Thread(obj);
		t.start();
	}
}








		
