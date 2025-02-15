import java.util.Scanner;

class Node{

	int data;
	Node prev;
	Node next;
	public Node(int data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
	
}
	

class Dll{
	Node head;
	static Scanner sc=new Scanner(System.in);
	
	void insert(){
		System.out.println("enter data");
		int num=sc.nextInt();
		
		Node newnode=new Node(num);
		if(head==null){
			head=newnode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
	}
	
	void delete(int key){
		if(head=null){
			System.out.println("empty");
			return;
		}
		Node temp=head;
		while(temp!=null && temp.data!=key){
			temp=temp.next;
		}
		if(temp==null){
			System.out.pintln("no data");
			return;
		}
		if(temp.prev!=null){
			temp.prev.next=temp.next;
		}
		if(temp.next!=null){
			temp.next.prev=temp.prev;
		}
	}
	
	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args){
		
	
	
