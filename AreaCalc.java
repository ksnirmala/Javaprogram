package switchstmt;
import java.util.Scanner;
public class AreaCalc  {
		public static void main(String[] args) {
			float pi=3.14f,side,len,breadth,radius,height,area_rec,area_cir,area_tri,area_squa;
			int choice;
			Scanner input=new Scanner(System.in);
			System.out.println("length=");
			len=input.nextFloat();
			System.out.println("breadth=");
			breadth=input.nextFloat();
			System.out.println("radius=");
			radius=input.nextFloat();
			System.out.println("height=");
			height=input.nextFloat();
			System.out.println("side=");
			side=input.nextFloat();
			System.out.println("enter your choice");
			choice=input.nextInt();
			switch(choice)
			{
			case 1:
				area_squa=side*side;
				System.out.println("the area of square is:"+area_squa);
				break;
			case 2:
				area_rec=len*breadth;
				System.out.println("the area of rectangle is:"+area_rec);
				break;
			case 3:
				area_cir=pi*radius*radius;
				System.out.println("the area of circle:"+area_cir);
				break;
			case 4:	
			     area_tri=(breadth*height)/2;
			     System.out.println("the area of triangle:"+area_tri);
			
		}

	}

}
