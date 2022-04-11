package arrayspro;
import java.util.Scanner;

public class PrintElements {

	public static void main(String[] args) {
		
		int arr[]= {4,5,6,7,8,9};
		System.out.println("Number of elements in array "+arr.length);
		for( int i=0;i<arr.length;i++) {
			System.out.println("arr[" +i+"]="+arr[i]);
		}
		//sum of array
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of all array elements="+sum);
		//avg of array elements
		float avg=((float)sum/arr.length);
		System.out.println("average="+avg);
		System.out.printf("%.4f\n", avg);
		//largest of an array
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("largest of an array elements="+max);
		//minimum of array elements
		int min=arr[0];
		for ( int i=1;i>arr.length;i++)
		{
			if(arr[i]<min)
				{
					min=arr[i];
				}
		}
		System.out.println("minimum of all array elements="+min);
	}

}
