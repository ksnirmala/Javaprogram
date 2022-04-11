package calcarea;
import java.util.Scanner;

public class CalArea {
	public static void main(String[] args) {
		float pi=3.14f,len,breadth,radius,height,area_rec,area_cir,area_tri;
		Scanner input=new Scanner(System.in);
		System.out.println("length");
		len=input.nextFloat();
		System.out.println("breadth");
		breadth=input.nextFloat();
		System.out.println("radius");
		radius=input.nextFloat();
		System.out.println("height");
		height=input.nextFloat();
		area_rec=len*breadth;
		area_cir=pi*radius*radius;
		area_tri=(breadth*height)/2;
		System.out.println("the area of rectangle:"+area_rec);
		System.out.println("the area of circle:"+area_cir);
		System.out.println("the area of triangle:"+area_tri);
		
		
		
		
	}

}
