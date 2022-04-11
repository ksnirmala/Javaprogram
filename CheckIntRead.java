package collections;

import java.util.Scanner;

public class CheckIntRead {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value:");
		if(sc.hasNextInt())
		{
			int x=sc.nextInt();
			System.out.println("your entered value:"+x);
		}
		else
		{
			System.out.println("please entered the integer value");
		}
       sc.close();
	}

}
