package stringspro;

import java.util.Scanner;

public class Uservalidation {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
        String name="nirmala";
        String pass="nirmala@12";
        String un,up;
		Scanner sc=new Scanner(System.in);
		int c=1;
		do {
		
		System.out.println("enter the user name:");
		un=sc.nextLine();
		System.out.println("enter the user password name:");
		up=sc.nextLine();
		if(un.equalsIgnoreCase(name)&&up.equals(pass))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login  not successful");
		}
		c++;
	    
		}while(c<=3);
		System.out.println(c+"attempts over");
	
	}
}
