package loop;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String args[]) {
		
	    int i,n,digit,rev=0;
		Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
		 n=sc.nextInt(); 
		 int m=n;
		while(n>0)
	
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("the reverse of a number" +m+" is:"+rev);
	}
}
