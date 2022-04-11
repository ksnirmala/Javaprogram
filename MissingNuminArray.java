package doubts;

import java.util.Scanner;

public class MissingNuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the total number of elements:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements in an array");
		for(int i=0;i<=n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int sumall=0;
		int  sum=(n)*(n+1)/2;
		for(int i=0;i<arr.length;i++) {
			sumall=sumall+arr[i];
		}
		int miss=sum-sumall;
		System.out.println("missing element is"+miss);
		

	}

}
