package threadproject;
class Myclass1 implements Runnable{
/* public Myclass1(String name){
	super();
}*/
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		System.out.println("run method"+Thread.currentThread());
		
	}
	
 }

public class Runnablemain {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass1 ob=new Myclass1();
		Thread tob=new Thread(ob);
		Myclass1 ob1=new Myclass1();
		Thread tob1=new Thread(ob1);
		tob.setName("first");
		tob1.setName("second");
		tob.start();
		tob1.start();
		

	}


}