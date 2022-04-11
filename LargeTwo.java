package largetwo;
import java.util.Scanner;

public class LargeTwo {
	public static void main(String[] arg) {
		int a,b,large;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number");
		a=input.nextInt();
		System.out.println("enter the second number");
		b=input.nextInt();
		large=(a>b)?a:b;
		System.out.println("the largest  number of  "+a+" and "+b+ "is: "+large);
		
		
		
		
	}
}
