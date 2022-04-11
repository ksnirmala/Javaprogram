package doubts;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     int digit;
		     String s;
			Scanner sc=new Scanner(System.in);
	         System.out.println("enter the string:");
			 s=sc.nextLine();
			 String rev="";
			for( int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			if(rev.equals(s))
			{
				System.out.println(" it is a palindrome ");
			}
			else
			{
				System.out.println(" it is  not a palindrome");
			}
			

	}

}
