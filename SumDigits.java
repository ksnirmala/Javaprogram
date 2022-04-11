package loop;
import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,digit,i,n,m;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
		 n=sc.nextInt();
		 m=n;
		 while(n!=0)
		 {
			 digit=n%10;
			 sum=sum+digit;
			 n=n/10;
		 }
		 System.out.println("the number "+m+" sum of its digits is:"+sum);

	}

}
