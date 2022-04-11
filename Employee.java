package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

class Employe{
	int id;
	String ename;
	float salary;
	int age;
	String dept;
	public Employe(int id,String ename,float salary, int age,String dept) {
		this.id=id;
		this.ename=ename;
		this.salary=salary;
		this.age=age;
		this.dept=dept;
		
	}
}

public class Employee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe ob1=new Employe(1,"nirmala",23000,22,"IT");
		Employe ob2=new Employe(2,"siva",50000,32,"CIVIL");
		Employe ob3=new Employe(3,"kavin",50000,30,"CIVIL");
		Employe ob4=new Employe(4,"nimmi",5000,32,"clerk");
		//ArrayList<Employe> a1=new ArrayListt<>();
		//LinkedList<Employe> a1=new LinkedList<>();
		Vector<Employe> a1=new Vector<>();
		a1.add(ob1);
		a1.add(ob2);
		a1.add(ob3);
		a1.add(ob4);
		System.out.println(a1);
		Iterator<Employe> it=a1.iterator();
		System.out.println("Id\tEname\tSalary\tAge\tDept");
		while(it.hasNext()) {
			Employe ob =(Employe) it.next();
			System.out.println(ob.id+"\t"+ob.ename+"\t"+ob.salary+"\t"+ob.age+"\t"+ob.dept+"\t");
			System.out.println();
		}

	}

}
