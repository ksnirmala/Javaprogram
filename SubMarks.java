package submarks;
import java.util.Scanner;
public class SubMarks {
	public static void main(String[] args) {
		String name;
		int s1,s2,s3,s4,s5;
		float avg;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the student name:");
		name=input.nextLine();
		System.out.println("enter the english marks:");
		s1=input.nextInt();
		System.out.println("enter the tamil marks:");
		s2=input.nextInt();
		System.out.println("enter the telugu marks:");
		s3=input.nextInt();
		System.out.println("enter the hindi  marks:");
		s4=input.nextInt();
		System.out.println("enter the science marks:");
		s5=input.nextInt();
		avg=(s1+s2+s3+s4+s5)/5;
		System.out.println("the student name is:"+name);
		System.out.println("the english mark is:"+s1);
		System.out.println("the tamil mark is:"+s2);
		System.out.println("the  telugu mark is:"+s3);
		System.out.println("the hindi  mark is:"+s4);
		System.out.println("the science mark is:"+s5);
		System.out.println("the average of  five subject marks is:"+avg);
		
		
	}

}
