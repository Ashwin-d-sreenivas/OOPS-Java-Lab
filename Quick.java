import java.util.*;

class Quick{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num of names:");
		int n=sc.nextInt();
		
		String[] names=new String[n];
		for(int i=0;i<n;i++){
			System.out.print("enter name:");
			names[i]=sc.next();
		}
		
		System.out.println("before sorting:");
		for(int j=0;j<n;j++){
			System.out.println(names[j]);
		}
		
		quickSort(names,0,n-1);
		
		System.out.println("after sorting:");
		for(int j=0;j<n;j++){
			System.out.println(names[j]);
		}
	}
	
	static int partition(String[] names,int start,int end){
	
		String pivot=names[end];
		int i=start-1;
		for(int j=start;j<end;j++){
			if(names[j].compareTo(pivot)<=0){
				i++;
				String temp=names[j];
				names[j]=names[i];
				names[i]=temp;
			}
		}
		String swap=names[i+1];
		names[i+1]=names[end];
		names[end]=swap;
		return i+1;
	}
	
	static void quickSort(String[] names,int start,int end){
		if(start<end){
			int pi=partition(names,start,end);
		
			quickSort(names,start,pi-1);
			quickSort(names,pi+1,end);
		}
	}
}
	
