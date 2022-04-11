import java.util.Scanner;
public class MinNumber {
	public static void main(String[] arg) {
		int a,b,c,small;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number");
		a=input.nextInt();
		System.out.println("enter the second number");
		b=input.nextInt();
		System.out.println("enter the third number");
		c=input.nextInt();	
		small=(a<b&&a<c)?a:(b<a&&b<c)?b:c;
		System.out.println("the minimum of three number  "+a+" and "+b+"and "+c+ "is: "+small);
	}

}
