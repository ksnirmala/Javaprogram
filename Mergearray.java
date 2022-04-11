package arrayspro;
import java.util.Scanner;
public class Mergearray {
	public static void main(String[] args) {
		int arr1[],arr2[],arr3[],n1,n2,n3,i,n4,arr4[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the first array:");
		n1=sc.nextInt();
		arr1=new int[n1];
		System.out.println("enter size of the second array:");
		n2=sc.nextInt();
		arr2=new int[n2];
		System.out.println("enter size of the third array:");
		n3=sc.nextInt();
		arr3=new int[n3];
		
		System.out.println("enter first array elements");
		for( i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter second array elements");
		for( i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("enter third array elements");
		for( i=0;i<arr3.length;i++)
		{
			arr3[i]=sc.nextInt();
		}
		n4=n1+n2+n3;
		arr4=new int[n4];
		for( i=0;i<arr1.length;i++)
		{
			arr4[i]=arr1[i];
		}
		for( i=0;i<arr2.length;i++)
		{
			arr4[n1+i]=arr2[i];
		}
		for( i=0;i<arr3.length;i++)
		{
			arr4[n1+n2+i]=arr3[i];
		}
		System.out.println("merge array is:");
		//System.out.print("{");
		for(i=0;i<arr4.length;i++)
		/*if( i<=arr4.length-2)
			System.out.print(arr4[i]+", ");
		else if(i==arr4.length-1) {*/
			System.out.println(arr4[i]);
	//	}

	//System.out.print("}");	
}

}
