package stringspro;

import java.util.Scanner;

public class Printstar_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s;
		 String a="";
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name of string");
			s=sc.nextLine();
			for( int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
				{
					a=a+"*";
				}
				else
				{
					a=a+ch;
				}
			}
			System.out.println(a);
	}

}
