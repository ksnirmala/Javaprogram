package condistmt;
import java.util.Scanner;
public class ifelseifladder {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number1:");
		num1=input.nextInt();
		System.out.println("enter the number2:");
		num2=input.nextInt();
		System.out.println("enter the number3:");
		num3=input.nextInt();
		if(num1>num2&&num1>num3){
			System.out.println(num1+ "is largest number");
			
		
	}
		if(num2>num1&&num2>num3){
			System.out.println(num2+ "is largest number");
			
		
	}
		if(num3>num1&&num3>num2){
			System.out.println(num3+ "is largest number");
			
		
	}
		else{
			System.out.println("all the numbers are equal");
			
		
	}
	}

}
