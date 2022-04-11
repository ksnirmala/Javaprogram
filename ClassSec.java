package days;
import java.util.Scanner;

public class ClassSec {
	public static void main(String[] arg) {
		int days,y;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no of days:");
		days=input.nextInt();
		y=24*days*60*60;
		System.out.println(" the day  is converted into seconds is:"+y);
		
	}
}
