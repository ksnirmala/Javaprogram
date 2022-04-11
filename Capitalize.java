package stringspro;
import java.util.Scanner;
public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of string");
		s=sc.nextLine();
         for(int i=0;i<s.length();i++)
         {
        	 if(i==0)
        	 {
        		 System.out.print(s.charAt(i)+"." );
        	 }
        	 else if(s.charAt(i)==' ')
        	 {
        		System.out.print(s.charAt(i+1)+ "."); 
        	 }
         }
	}

}
