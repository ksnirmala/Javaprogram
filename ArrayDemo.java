package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> ob=new ArrayList<>();
       ob.add(34);
       ob.add(56);
       ob.add(87);
       ob.add(1,89);
       System.out.println(ob);
       System.out.println(ob.contains(56));
       System.out.println(ob.indexOf(56));
       ob.clear();
       System.out.println(ob);
       /*Iterator<E> it=new Iterator();
       while(it.hasNext()) {
    	   
       }*/
	}

}
