package oopsprogram;
class copyconstuctor{
	int i,j;
copyconstuctor(int i,int j){
		this.i=i;
		this.j=j;
		System.out.println("first obj="+this.i);
		System.out.println("second obj="+this.j);
			
	}
 copyconstuctor(copyconstuctor firstobj) {
	this.i=firstobj.i;
	this.j=firstobj.j;
	System.out.println("first obj="+this.i);
	System.out.println("first obj="+this.i);
	
}

	// TODO Auto-generated constructor stub
}


public class Copyconstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyconstuctor firstobj=new copyconstuctor(10,20);
        copyconstuctor secondobj=new copyconstuctor(firstobj);
	}

}
