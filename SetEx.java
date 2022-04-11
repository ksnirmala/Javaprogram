package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;



public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<String> a1=new TreeSet<String>();
	//	HashSet<String> a1=new HashSet<String>();
		LinkedHashSet<String> a1=new LinkedHashSet<String>();
		a1.add("ravi");
		a1.add("vimal");
		a1.add("siva");
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
