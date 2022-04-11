package Exceptionhandling;

public class Keywords {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=24,dev=0;
		int ans=0;
		int a[]=new int[6];
		System.out.println("before division");
		try
		{
			a[3]=5;
			ans=num/dev;
			//char[] Exit;
			//System.out.println(Exit(0));
			return;

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println("executes always");
		}
		System.out.println(ans);
		System.out.println("after division");

	}

	/*private static char[] Exit(int i) {
		// TODO Auto-generated method stub
		return null;
	}*/

	

	

}
