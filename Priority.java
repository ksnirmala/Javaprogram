package threadproject;
class ChildThread extends Thread{
	public void main() {
		System.out.println("run method"+Thread.currentThread());
	
	}
}

public class Priority {

	public static void main(String[] args) {
		System.out.println("main method"+Thread.currentThread());

		
	}

}
