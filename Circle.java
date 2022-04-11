package assignment;

public class Circle {
	private final double PI=3.14;
	private double radius;
	
	
	public Circle(double r) {
		radius=r;
		
	}
	public void circle() {
		radius=0;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		
		return PI*radius*radius;
	}

	public double getCircumference() {
		
		return 2*PI*radius;
	}
	public void setRadius(double r) {
		radius =r;
		
	}
	

	public static void main(String[] args) {
	Circle c1=new Circle(1.1);
	System.out.println(c1);
	Circle c2=new Circle(0);
	System.out.println();
	c1.setRadius(2.2);
	System.out.println(c1);
	System.out.println("radius is:"+c1.getRadius());
	System.out.println("area is:"+c1.getArea());
	System.out.println("circumference is:"+c1.getCircumference());
	
		
	}
	
}
