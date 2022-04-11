package loop;
import java.util.Scanner;

public class Factorsofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,temp=1,i,sum=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
		 n=sc.nextInt(); 
		 System.out.println("the factors of a "+n+ " is:");
        for( i=1;i<=n;i++)
        {
        	if(n%i==0) {
        	
        		//continue;
        		sum=sum+i;
        		System.out.print(i+" " );
                 }
        	//System.out.print("sum of the factors of" +n+"is"+sum );
        	/*else
        	{
        		System.out.print(i+" " );
        	}*/
       
        }
        System.out.print("\nsum of the factors of " +n+ " is"+sum );
       
	}

}
