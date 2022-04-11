package loop;
import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int m,digit,result=0;
		Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
		 m=sc.nextInt(); 
		 int num=m;
		while(m!=0)
		{
			digit=m%10;
			result=result+(digit*digit*digit);
			m=m/10;
		}
		if(result==num)
		{
			System.out.println(num+" is an amstrong number");
		}
		else
		{
			System.out.println(num+" is  not an amstrong number");
		}
}
}
