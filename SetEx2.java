package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashSet<String> a1=new LinkedHashSet<String>();
		TreeSet<String> a1=new TreeSet<String>();
		a1.add("ravi");
		a1.add("vimal");
		a1.add("siva");
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing element through Iterator in desending order");
        Iterator i=a1.descendingIterator();
        while(i.hasNext()) {
        	System.out.println(i.hasNext());
        }
	}

}
