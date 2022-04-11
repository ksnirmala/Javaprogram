package rectangle;

public class Rectangle {
	public static void main(String args[]) {
//area of rectangle//		
		float a=5.5f,l=4.2f,b=5.0f,r=4.3f,h=9.8f,area_rec,area_squ,area_cir,area_tri,pi=3.14f;
		area_rec=l*b;
		area_squ=a*a;
		area_cir=pi*r*r;
		area_tri=(b*h)/2;
		System.out.println(" The area of rectangle  length= " +l+ " and  breadth= " +b+ " is:"+area_rec);
		System.out.println(" The area of square side= " +a+  " is:"+area_squ);
		System.out.println(" The area of circle  radius= " +r+ "is:"+area_cir);
		System.out.println(" The area of triangle breadth= " +b+ " and  height= " +h+ " is:"+area_tri);
//reverse number//		
		int n=10574,d;
		d=n%10;
		System .out.print(d);
		n=n/10;
		d=n%10;
		System .out.print(d);
		n=n/10;
		d=n%10;
		System .out.print(d);
		n=n/10;
		d=n%10;
		System .out.print(d);
		n=n/10;
		d=n%10;
		System .out.print(d);
		
		
	}
	

}
