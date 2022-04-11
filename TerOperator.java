package ternary;

public class TerOperator {
	public static void main(String args[]) {
		int a=10,b=5,c=80,d=20,large;
		large=(a>b&&a>c&&a>d)?a:(b>a&&b>b&&a>d)?b:(c>a&&c>b&&c>d)?c:d;
		System.out.println("The largest number of "  +a+ "  "+b+"  "+c+"  "+d+"  is:" +large);
		
	}

}
