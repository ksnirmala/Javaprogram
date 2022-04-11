package oopsprogram;

class myconstruct{
	int i,j,k;
	myconstruct(){
		System.out.println("inside constructor");
		i=3;j=9;
		System.out.println("i="+i+"and j="+j);
	}
	myconstruct(int i,int j)
	{
		System.out.println("with two argument");
		this.i=i;
		this.j=j;
	}
	myconstruct(int i,int j,int k){
		System.out.println("with three argument");
		this.i=i;
		this.j=j;
		this.k=k;
		
	}
void largetwo() {
	int l=(i>j)?i:j;
	System.out.println("largest of two number is="+l);
}
void largethree() {
	int l=(i>j&&i>k)?i:k;
	System.out.println("largest of three number is="+l);
	
}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myconstruct ob=new myconstruct();
		myconstruct ob1=new myconstruct(1,2);
		myconstruct ob2=new myconstruct(2,3,4);
		ob1.largetwo();
		ob2.largethree();
		

	}

}
