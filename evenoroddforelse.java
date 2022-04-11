package condistmt;
import java.util.Scanner;
public class evenoroddforelse {
	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		num=input.nextInt();
		if(num%2==0) {
			System.out.println("numer "+ ""+num+ "is even");
		}
		else {
			System.out.println("numer " +num+ " is odd");
		}
		}
			
	}


