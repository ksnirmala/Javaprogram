package threadproject;
class Myclass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("run method"+Thread.currentThread()+"i="+i);
		
	}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*void display() {
		System.out.println("diplay()"+Thread.currentThread());
	}*/
}


public class Createthread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("JVM thread"+Thread.currentThread());
		Myclass ob=new Myclass();
		Myclass ob1=new Myclass();
		ob.setName("firstthread");
		ob1.setName("secondthread");
		System.out.println("status"+ob.isAlive());
		//ob.display();
		ob.start();
		System.out.println("status"+ob.isAlive());
		ob.join();
		System.out.println("status"+ob.isAlive());
		ob1.start();
		//ob1.join();

	}

}
