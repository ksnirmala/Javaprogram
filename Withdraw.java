package Exceptionhandling;
import java.util.Scanner;

class exp1 extends Exception{
	exp1(String s){
		super(s);
	}
	
}
class bankk{
	final int bal=500;
	void withdraw(int amount) throws exp1 {
		if(amount>bal)throw new exp1 ("account balance low");
	}
}

public class Withdraw {

	public static void main(String[] args) throws exp1 {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdraw amount");
		int withdraw=sc.nextInt();
		bankk b=new bankk();
	    b.withdraw(withdraw);

	}

}
