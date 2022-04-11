package collections;

import java.util.ArrayList;
import java.util.Iterator;

class Students{
	int rollno;
	String sname;
	float fees;
	public Students(int i,String string, int j) {
		rollno=i;
		sname=string;
		fees=j;
		
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students ob1=new Students(1,"nirmala",23000);
		Students ob2=new Students(2,"siva",50000);
		ArrayList<Students> a=new ArrayList<>();
		a.add(ob1);
		a.add(ob2);
		System.out.println(a);
		Iterator<Students> it=a.iterator();
		System.out.println("rollno\tsname\tfees");
		while(it.hasNext()) {
			Students a1=(Students) it.next();
			System.out.println(a1.rollno+"\t"+a1.sname+"\t"+a1.fees+"\t\t");
			System.out.println();
			
		}
		
		
		
		

	}

}
