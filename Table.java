package threadproject;

class Tablees{
void print(int n,String s) {
  		synchronized(this){
		for(int i=1;i<=10;i++) {
			System.out.println("n x"+i+"="+n*i);
		}
		for(int j=1;j<=10;j++) {
			System.out.println(s);
		}
  		}
}
}
class FirstThread extends Thread{
	Tablees t;

public FirstThread(Tablees te) {
		this.t=te;
	}
public void run()
{
	t.print(5,"hello");
}
}
class SecondThread extends Thread{
	Tablees t;

public SecondThread(Tablees te) {
		this.t=te;
	}

public void run() {
	t.print(10,"edubridge");
}
}

public class Table {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablees te=new Tablees();
		FirstThread t1=new FirstThread(te);
		SecondThread t2=new SecondThread(te);
		t1.start();
		t2.start();
	}

}
