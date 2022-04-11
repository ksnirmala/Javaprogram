package stringspro;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		 String s;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name of string");
			s=sc.nextLine();
	         for(int i=s.length()-1;i>=0;i--)
	         {
	        	 System.out.print(s.charAt(i));
	         }

	}

}
