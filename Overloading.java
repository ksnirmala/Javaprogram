package com.edu;


class overloadseries {
	void series(int p) {
		int s;
		for(int i=1;i<=p;i++) {
			s=(i*i*i)-1;
			System.out.print(s+" ");
		}
		
	}
	void series(int x,int n) {
		double s=0;
		for(int i=0;i<=n;i++) {
			s=s+Math.pow(x, i);
		}
		System.out.println(s);
		
	}
	
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadseries ob=new overloadseries();
		ob.series(2, 5);
		ob.series(5);

	}

}
