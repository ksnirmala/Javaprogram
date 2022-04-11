package oopsconcepts;
import java.util.Scanner;
import java.lang.*;
class student{
	String name;
	int id;
	float fees;
	char gen;
	int age;

void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name,id,fees,gen,age of a student");
	name=sc.nextLine();
	id=sc.nextInt();
	fees=sc.nextFloat();
	gen=sc.next().charAt(0);
	age=sc.nextInt();
}
	
	void display() {
		System.out.println("name="+name);
		System.out.println("id="+id);
		System.out.println("fees="+fees);
		System.out.println("gen="+gen);
		System.out.println("age="+age);
	}
		
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student sob=new student();
		System.out.println(sob);
		sob.input();
		sob.display();
		

	}

}
