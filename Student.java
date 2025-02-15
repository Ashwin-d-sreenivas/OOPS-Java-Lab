import java.util.Scanner;


class Student{
	public static void main(String[] args){
		Result s=new Result();
		s.create(123,23,42);
		s.define(72);
		s.display();
		s.print();
	}
}



class Mark{
	int regno;
	int mark1;
	int mark2;
	
	public void create(int regno,int mark1,int mark2){
		this.regno=regno;
		this.mark1=mark1;
		this.mark2=mark2;
	}
	public void display(){
		System.out.println("reg="+regno);
		System.out.println("mark 1="+mark1);
		System.out.println("mark 2="+mark2);
	}
}

interface Sports{
	void define(int s_mark);
	void print();
}

class Result extends Mark implements Sports{
	int s_mark;
	public void define(int s_mark){
		this.s_mark=s_mark;
	}
	
	public void print(){
		System.out.println("sports marks="+s_mark);
	}
}


	
