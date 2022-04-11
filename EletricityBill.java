package condistmt;
import java.util.Scanner;
public class EletricityBill {
	public static void main(String[] args) {
		int units;
		float amount;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of units consumed in electricitybill");
		units=input.nextInt();
		if(units<100)
		{
			amount=units*0.80f;
					}
		else if(units>=100&&units<=300){
		
			amount=100*0.80f+(units-100)*1;
	             		}
		else {
			
			amount=100*0.80f+200*1+(units-300)*2.50f;
		}
		System.out.println("electricity bill for units"+units+"in RS:"+amount);
	}

}
