package oopsprogram;
class Parent{
	int id;
	public  void display() {
		System.out.println("Parent class display function");
	}
}

class child extends Parent{
	int k;
	public void display() {
		
		System.out.println("child class display function");
		
	}
	void child_function() {
		System.out.println("child_function");
	}
}

		


public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ob=new child(); //memory allocation (both)
		ob.display();
		ob.child_function();
		System.out.println("id="+ob.id);
		
		Parent pob = new Parent();
		pob.display();	
		Parent p = new child(); //memory is allocated only parent
		p.display();//overriden method parent method

	}

}
