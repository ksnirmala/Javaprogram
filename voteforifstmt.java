package condistmt;
import java.util.Scanner;
public class voteforifstmt {
	public static void main(String[] args) {
		int age;
		String name;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the name:");
		name=input.nextLine();
		System.out.println("enter the age:");
		age=input.nextInt();
		System.out.println("the name is:"+name);
		if(age>=18)
		{
			System.out.println("eligible for vote");	
		}
		if(age<18)
		{
			System.out.println(" not eligible for vote");	
		}


}
}