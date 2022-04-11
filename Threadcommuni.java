package threadproject;
class excr extends Thread{
	int total;
	public void run() {
		synchronized(this) {
		for(int i=1;i<=50;i++) {
			total+=i;
		}
		
		notify();
	}
	}
	
	
}

public class Threadcommuni {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		excr t=new excr();
		t.start();
		synchronized(t) {
			System.out.println("wait complete total");
			t.wait();
		
		System.out.println("total="+t.total);
		}
	}

}
