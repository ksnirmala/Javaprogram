package doubts;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,n=12;
		int res=0;
		System.out.println(a);
		System.out.println(b);
		for( int i=3;i<=n;i++) {
		 res=a+b;
		 System.out.println(res);
			a=b;
			b=res;
			//System.out.println(res);
		}
		//System.out.println(res);

	}

}
