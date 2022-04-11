package oopsprogram;
interface MyInterface{
	int i=10;
	void m1();
	void m2();
	
}
interface anotherInterface extends MyInterface{
	void m4();
} 
interface ThirdInterface{
	void m5();
}
class c implements anotherInterface,ThirdInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("m5 method");
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 method");
		
	}
	
}
class B implements anotherInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 method");
		
	}
	
}
	

class A implements MyInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
		
	}
	
	
}

public class Interface {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		ob.m1();
		ob.m2();
	
		
		B obj=new B();
		obj.m1();
		obj.m2();
		obj.m4();

		c obj1=new c();
		obj1.m1();
		obj1.m2();
		obj1.m4();
		obj1.m5();

	}




}