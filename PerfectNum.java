package loop;
import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,i,sum=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
		 n=sc.nextInt();
        for( i=1;i<n;i++)
        {
        	if(n%i==0) {
        	//System.out.println(i+" " );
        		sum=sum+i;
                 }
        }
       // System.out.println("sum is"+sum);
        if(sum==n)
        {
        	System.out.println(n+" it is perfect number");
        }
        else
        {
        	System.out.println(n+" it is  not perfect number");	
        }
		 
		 
		
	}
	}




