package Exceptionhandling;

import java.util.Scanner;

class MyException extends Exception{
	MyException(String s){
		super(s);
	}
	
}
class  age{
	final int age1=18;
    void checkage(int a) throws MyException
	{
		if(a<this.age1) {
			throw new MyException("not eligible");
			
		}
	}
}

public class CustomException {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		age ob=new age();
		ob.checkage(age);
		

	}

}
