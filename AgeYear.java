package age;
import java.util.Scanner;

public class AgeYear {
	public static void main(String[] arg) {
		int age,x,yr,days,minutes,sec,mon,hr;
		String name;
		Scanner input=new Scanner(System.in);
		System.out.println("enter your name:");
		name=input.next();
		System.out.println("Enter your age:");
		age=input.nextInt();
		System.out.println("the name is: "+name);
		System.out.println("your age is "+age+"years old");
		mon=age*12;
		System.out.println("months "+mon);
		days=365*age;
		System.out.println("days "+days);
		hr=days*24;
		System.out.println("hours "+hr);
		minutes=days*24*60;
		System.out.println("minutes "+minutes);
		sec=days*24*60*60;
		System.out.println("seconds "+sec);
		
		
		
		
	}
	

}
