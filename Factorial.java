package loop;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		int n,i,fact=1;
		Scanner sc=new Scanner(System.in)
;		System.out.println("enter the no of factorial:");
		n=sc.nextInt();
		/*for(i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+ "is "+fact);
		*/
		i=n;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println("factorial of "+n+ "is "+fact);
		
	}

}
