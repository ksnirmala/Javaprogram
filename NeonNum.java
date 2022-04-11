package loop;

import java.util.Scanner;

public class NeonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,digit,n,m;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
		 n=sc.nextInt();
		 m=n;
		 int s=n*n;
		//for(n=0;n<=10;n++)
		 while(s!=0)
		 {
			 digit=s%10;
			 sum=sum+digit;
			 s=s/10;
		 }
		 if(sum==n)
		 {
		 System.out.println("the number "+m+"  is neon number");
		 }
		 else
		 {
			 System.out.println("the number "+m+"  is  not neon number");
		 }
		 
		 

	}

}
