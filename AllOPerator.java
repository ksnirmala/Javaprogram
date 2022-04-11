package alloperator;
import java.util.Scanner;
public class AllOPerator {
	public static void main(String[] args) {
		int a,b,add,sub,mul,div;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number1:");
		a=input.nextInt();
		System.out.println("enter the number2:");
		b=input.nextInt();
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a%b;
		System.out.println("addition of  "+a+" and "+b+" is:" +add);
		System.out.println("substraction of  "+a+" and "+b+" is:" +sub);
		System.out.println("mulitiplication of  "+a+" and "+b+" is:" +mul);
		System.out.println("division to get remainder of  "+a+" and "+b+" is:" +div);
		
		
	}

}
