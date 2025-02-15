import java.util.Scanner;

class Bin{
	static int Search(int[] arr,int f,int l,int key){
		int mid=(f+l)/2;
		while(f<=l){
			if(arr[mid]==key){
				return mid;
			}
			else if(arr[mid]>key){
				l=mid-1;
			}
			else{
				f=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int n=5;
		for(int i=0;i<5;i++){
			System.out.println("enter "+i+"=");
			arr[i]=sc.nextInt();
		}
		System.out.println("enter key");
		int key=sc.nextInt();
		int res=Search(arr,0,n-1,key);
		
		if(res==-1){
		System.out.println("not");
		}
		else{
			System.out.println("key at:"+res);
		}
	}
}
