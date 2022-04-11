package oopsprogram;
class functionoverloading
{
	void display()
	{
		System.out.println("no argument");
	}
	void display(int i)
	{
		System.out.println("one int argument");
	}
	void display(int i ,int j)
	{
		System.out.println("two int argument");
	}
	void display(float f)
	{
		System.out.println("one float argument");
	}
	void display(float i,float j)
	{
		System.out.println("two float argument");
	}
	void display(int i,float j)
	{
		System.out.println("one int,one float argument");
	}
	void display(float i,int j)
	{
		System.out.println("one float one int argument");
	}
}

public class Functionoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionoverloading ob=new functionoverloading();
		ob.display();
		ob.display(5);
		ob.display(5,8);
		ob.display(2.4f);
		ob.display(2.4f,5.6f);
		ob.display(2,2.4f);
		ob.display(2.3f,6);
		

	}

}
