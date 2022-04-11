package loop;
import java.util.Scanner;
public class Evennum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=2;
		int sum=0;
		Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
		 num=sc.nextInt();
		 while(i<=num)
		 {
			 sum=sum+i;
			 i=i+2;
		 }
		 
		/* for(i=2;i<=num;i=i+2)
		 {
			 sum=sum+i;
		 }*/
		 System.out.println("sum of 1 to "+num+ "even number is:"+sum);
}
}


