import java.util.Scanner;

public class Matrix{
	static Scanner sc=new Scanner(System.in);
	static int[][] create(int r,int c){
		int [][] mat=new int[r][c];
		int i,j;
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				System.out.println("mat "+i+" "+j+"=");
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	static void display(int[][] mat,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.println(mat[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	static int[][] mul(int[][] mat1,int r1,int c1,int[][] mat2,int r2,int c2){
		int[][] res=new int[r1][c2];
		int i,j,k;
		k=0;
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++){
				for(k=0;k<c2;k++){
					res[i][k]=mat1[i][j]+mat2[j][k];
				}
			}
		}
		return res;
	}
	
	
	public static void main(String[] args){
		System.out.println("enter row of mat 1:");
		int r1=sc.nextInt();
		System.out.println("enter coloumns of mat 1:");
		int c1=sc.nextInt();
		int[][] mat1=create(r1,c1);
		
		System.out.println("enter r2:");
		int r2=sc.nextInt();
		System.out.println("enter c2:");
		int c2=sc.nextInt();
		int[][] mat2=create(r2,c2);
		
		if(c1!=r2){
			System.out.println("mul no:");
		}
		else{
			int[][] mul=mul(mat1,r1,c1,mat2,r2,c2);
			display(mul,r1,c2);
		}
	}
}
	
	
	
	
	
