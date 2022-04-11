package stringspro;

import java.util.Scanner;

public class Initialname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of string");
		s=sc.nextLine();
         for(int i=0;i<s.length();i++)
         {
        	 char ch=s.charAt(i);
        	 if(i==0)
        	 {
        		 System.out.print(s.charAt(i)+"." );
        	 }
        	 if(ch==' ')
        	 {
        		//System.out.print(s.charAt(i+1)+ "."); 
        		 break;
        	 }
        	/* if(ch==' ')
        	 {
        		 break;
        	 }*/
         }
         
         System.out.println(s.substring(8));
	}

}
