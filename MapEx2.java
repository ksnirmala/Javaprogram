package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Student1{
	int sid;
	String sname;
	float fees;
	public Student1(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	
}

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<Integer,Student1> hb=new HashMap<Integer,Student1>();
        Student1 s1=new Student1(1,"nirmala",200.0f);
        Student1 s2=new Student1(2,"nimmi",300.0f);
        Student1 s3=new Student1(3,"siva",500.0f);
        hb.put(1, s1);
        hb.put(2, s2);
        hb.put(3, s3);
        for(Map.Entry<Integer, Student1>m :hb.entrySet() ) {
        	Student1 s=m.getValue();
        	System.out.println(m.getKey() +". "+s.sid+"  "+s.sname+"  "+s.fees);
        }
      

        
	}

}
