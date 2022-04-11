package loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		    int num,digit,rev=0;
			Scanner sc=new Scanner(System.in);
	         System.out.println("enter the number:");
			 num=sc.nextInt(); 
			 int m=num;
			while(num>0)
			{
				digit=num%10;
				rev=rev*10+digit;
				num=num/10;
			}
			if(m==rev)
			{
				System.out.println(m+" is a palindrome number");
			}
			else
			{
				System.out.println(m+" is  not a palindrome number");
			}
			
			
	}

}
