package collections;
import java.util.HashMap;
import java.util.Map;
class Studentss{
	int sid;
	String name;
	float fees;
	public Integer sname;
	public Studentss(int sid, String name, float fees) {
		super();
		this.sid = sid;
		this.name = name;
		this.fees = fees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
}


public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Studentss> hb=new HashMap<>();
        Studentss s1=new Studentss(1,"Manoj",45632.4f);
        Studentss s2=new Studentss(2,"Ravi",55632.4f);
        Studentss s3=new Studentss(7,"Mohini",65632.4f);
        
        hb.put(1, s1);
        hb.put(2, s2);
        hb.put(3, s3);
        for(Map.Entry<Integer, Studentss>m :hb.entrySet() ) {
        	Studentss s=m.getValue();
        	System.out.println(m.getValue().fees+" "+m.getValue().name+" "+m.getValue().sid);
        }
      

}
}
