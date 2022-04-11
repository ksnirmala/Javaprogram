package threadproject;
class tabl{
	void print(int n) {
  		synchronized(this){
		for(int i=1;i<=10;i++) {
			System.out.println(n+" x"+i+"="+n*i);
		}
  		}
}

public class Table1 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		tabl tb=new tabl();
		Thread t=new Thread() {
		public void run() {
			tb.print(7);
		}
		};
      t.start();
      Thread t1=new Thread() {
  		public void run() {
  			tb.print(7);
  		}
  		};
        t1.start();
  	}

	}
}


