package loop;
import java.util.Scanner;
public class Oddnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
		 num=sc.nextInt();
		/* while(i<=num)
		 {
			 sum=sum+i;
			 i=i+2;
		 }*/
		 
		 for(i=1;i<=num;i=i+2)
		 {
			 sum=sum+i;
		 }
		 System.out.println("sum of 1 to "+num+ " odd number is:"+sum);
}

}
