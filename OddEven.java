package switchstmt;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		 Scanner input=new Scanner(System.in);
		 System.out.println("enter the number:");
         num=input.nextInt();
         switch(num%2)
         {
         case 1:
        	 System.out.println("the number is odd");
        	 break;
         case 0:
        	 System.out.println("the number is even");
        	 
        	 
         }
	}

}
