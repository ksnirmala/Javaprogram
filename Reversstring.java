package stringspro;

import java.util.Scanner;

public class Reversstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name of string");
			s=sc.nextLine();
			String sp[]=s.split(" ");
			//System.out.println();
			for(int i=sp.length-1;i>=0;i--)
			{
				System.out.print(sp[i]+" ");
			}
			System.out.println("\n\"nirmala\"");
			
	}

}
