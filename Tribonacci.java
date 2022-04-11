package doubts;

public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,c=1,b=1,n=12;
		int res=0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for( int i=3;i<=n;i++) {
		 res=a+b+c;
		 System.out.println(res);
			a=b;
			b=c;
			c=res;
		}
	}

}
