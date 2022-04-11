package Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multicatch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name = null;
		String pass = null;
		int age=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		
		System.out.println("enter name");
		name=br.readLine();
		System.out.println("enter password");
		pass=br.readLine();
		System.out.println("enter age");
		age=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException|NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("name="+name);
		System.out.println("pass="+pass);
		System.out.println("age="+age);

	}

}
