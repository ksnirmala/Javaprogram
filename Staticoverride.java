package oopsprogram;

class Parentclass{
	int id;
	public static void display() { 
		System.out.println(" Parent class display function");
	}
}

class childclass extends Parent{
	int k;
	/*public  void display() { //static method cannot be overriden
	 //static method are inheritated you can use it with ref to class or object
		
		System.out.println("child class display function");
		
	}*/
	void child_function() {
		System.out.println("child_function");
	}
}



public class Staticoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent ob = new Parent();
		Parentclass.display();
		ob.display();
		
		childclass cob = new childclass();
		cob.display();

	}

}
