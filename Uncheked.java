package Exceptionhandling;

public class Uncheked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=24,dev=0;
		int ans=0;
		System.out.println("before division");
		try
		{
			ans=num%dev;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println(ans);
		System.out.println("After division");

	}

}
