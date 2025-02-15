import java.util.Random;
import java.lang.Thread;

class RandomGenerato extends Thread {
    Random r = new Random();

    public void run() {
        int i = 0;
        int n = 10;
        while (i < n) {
            int rnum = r.nextInt(20);
            if (rnum % 2 == 0) {
                Squar sq = new Squar(rnum);
                sq.start();
            } else {
                Cub cb = new Cub(rnum);
                cb.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
            i++;
        }
    }
}

class Squar extends Thread{
	int num;
	public Squar(int num){
		this.num=num;
	}
	public void run(){
		System.out.println("Square of num"+num+"="+(num*num));
	}
}


class Cub extends Thread{
	int num;
	public Cub(int num){
		this.num=num;
	}
	public void run(){
		System.out.println("cube of num"+num+"="+(num*num*num));
	}
}

class Th{
	public static void main(String[] args){
		RandomGenerato rg=new RandomGenerato();
		rg.start();
	}
}





	
