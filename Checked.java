package Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checked {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter id");
          i=Integer.parseInt(br.readLine());
          System.out.println(i);
}

}
