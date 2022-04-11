package com.edu;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
	/*	for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				System.out.println();
			}
			else
			{
				System.out.print(ch);
			}
		}*/
		String sp[]=s.split(" ");
		//System.out.println();
		for(int i=0;i<sp.length;i++)
		{
			System.out.println(sp[i]+" ");
		}

	}

}
