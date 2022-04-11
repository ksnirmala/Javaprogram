package loop;
import java.util.Scanner;
public class Naturalnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
		 num=sc.nextInt();
		/* while(i<=num)
		 {
			 sum=sum+i;
			 i=i+1;
		 }
		 */
		 for(i=1;i<=num;i++)
		 {
			 sum=sum+i;
		 }
		 System.out.println("sum of 1 to "+num+ "natural number is:"+sum);
}
}
