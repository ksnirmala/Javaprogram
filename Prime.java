package loop;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		/*int num,i,c=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
		 num=sc.nextInt(); 
		/* for(i=1;i<=num;i++) {
			 if(num%i==0)
			 {
				 c++;
			 }
			 
		 }
			if(c==2)
			 {
				 System.out.println(num+" is prime number");
			 }
			 else
			 {
				 System.out.println(num+" is not prime number");
			 }
		
	*/
		int i,count;
        System.out.print("Enter n value : ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        System.out.println("Prime numbers between 25 to "+n+" are ");
for(int j=25;j<=n;j++)
{
count=0;
for(i=1;i<=j;i++)
{
if(j%i==0)
{
     count++;        
}
}
if(count==2)
    System.out.print(j+"  ");     
}

}
}