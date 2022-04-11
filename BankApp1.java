package threadproject;
class MyBank extends Thread{
	static int amount=10000;
	synchronized void deposit(int n) {
		amount=amount+n;
		System.out.println("you r in deposit");
		notify();		
	}
	void withdraw(int n) throws InterruptedException {
		if(n>amount) {
		System.out.println("insufficient balaance,deposit first");
		 wait();
		}
		else
		{
			amount=amount-n;
		}
		System.out.println("your balance is"+amount);
	}
}

public class BankApp1 {

	public static void main(String[] args) {
		MyBank mb=new MyBank();
		//Thread t1=new Thread() {
		new Thread() {	
			public void run() {
				System.out.println("deposit");
				mb.deposit(20000);
				
			}
		}.start();
		//Thread t2=new Thread() {
		new Thread() {
			public void run() {
				System.out.println("withdraw");
				try {
				mb.withdraw(5000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		System.out.println("you r in main");

	}

}
