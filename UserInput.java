package userinput;
import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		int age;
		String name;
		float fees;
		char gen;
		double loan;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=input.next();
		System.out.println("Enter your age:");
		age=input.nextInt();
		System.out.println("Enter your fees:");
		fees=input.nextFloat();
		System.out.println("Enter your genden M/F:");
		gen=input.next().charAt(0);
		System.out.println("Enter your loan:");
		loan=input.nextDouble();
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("fees is "+fees);
		System.out.println("gender is "+gen);
		System.out.println(" your loan is "+loan);
		
		
		
	}

}
