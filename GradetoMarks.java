package condistmt;
import java.util.Scanner;
public class GradetoMarks {
	public static void main(String[] args) {
		char grade;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the student grade:");
		grade=input.next().charAt(0);
		if(grade=='A'||grade=='a')
		{
			System.out.println(grade+" the grade of marks range is between 90-100");
		}
		
		else if(grade=='B'||grade=='b')
		{
			System.out.println(grade+" the grade of marks range is between 60-89");
		}
		else if(grade=='C'||grade=='c')
		{
			System.out.println(grade+" the grade of marks range is between 40-59");
		}
		else if(grade=='D'||grade=='d')
		{
			System.out.println(grade+" the grade of marks range is between 0-39");
		}
		else
		{
			System.out.println("invalid grade");
		}
			
	}
	

}
