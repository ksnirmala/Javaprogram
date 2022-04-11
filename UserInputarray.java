package arrayspro;
import java.util.Scanner;
public class UserInputarray {
	public static void main(String[] args) {
		int arr[];
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("enter " +n+" elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
