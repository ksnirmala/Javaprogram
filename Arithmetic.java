package switchstmt;
import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1,num2,result = 0;
		int choice;
		 Scanner input=new Scanner(System.in);
         System.out.println("enter the number1");
         num1=input.nextFloat();
         System.out.println("enter the number2");
         num2=input.nextFloat();
         System.out.println("1.Addition");
         System.out.println("2.substraction");
         System.out.println("3.multication");
         System.out.println("4.division");
         System.out.println("enter your choice");
         choice=input.nextInt();
         switch(choice)
         {
         case 1:
        	 result=num1+num2;
             break;
         case 2:
         	result=num1-num2;
         	break;
         case 3:	
         	result=num1*num2;
         	break;
         case 4:
         	result=num1/num2;
         	break;
         default:
         	System.out.println("invalid input");
            
	     }
         System.out.println("the result is=" +result);	
         
  	
}
}






























