package loop;
import java.util.Scanner;
public class EvenOddsum {
	public static void main(String[] args) {
		int i=1,sum=0,n;
		Scanner input=  new Scanner(System.in);
		System.out.println("enter the number");
		n=input.nextInt();
		int evensum=0,oddsum=0;
		for(i=1;i<=n;i++) {
			
			if(i%2==0)
			{
				evensum=evensum+i;
			}
		    else
		    {
			     oddsum=oddsum+i;
		    }
			
		}
		
		System.out.println("evensum="+evensum);
		System.out.println("oddsum="+oddsum);
		
	}

}
