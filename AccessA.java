package Acesswithpack;
class accessspecifiers{
	private int id;
	String name;
	protected float fees;
	public String cname;
	public accessspecifiers(int id, String name, float fees, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.cname = cname;
	}
	
	
}

public class AccessA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessspecifiers ob=new accessspecifiers(1,"kiran",8000.0f,"svpp");
		//System.out.println("id="+ob.id);
		System.out.println("name="+ob.name);
		System.out.println("fees="+ob.fees);
		System.out.println("cname="+ob.cname);
		
			
		
		}

}
