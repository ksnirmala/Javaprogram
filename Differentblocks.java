package oopsprogram;

public class Differentblocks {
	static String cname;
	static {
		cname="edubridge";
		System.out.println("static block will execute before main");
	}
	{
		System.out.println("before constructor only if user creates an object");
	}
	Differentblocks(){
		System.out.println("on object creation");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Differentblocks ob=new Differentblocks();

	}

}
