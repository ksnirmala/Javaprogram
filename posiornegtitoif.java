package condistmt;
import java.util.Scanner;
public class posiornegtitoif {
	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		num=input.nextInt();
		if(num>0)
		{
			System.out.println( num +" is positive");
		}
		if(num<0)
		{
			System.out.println( num +" is negative");	
		}
		if(num==0)
		{
			System.out.println( num +" is neutral");
		}
	}

}
