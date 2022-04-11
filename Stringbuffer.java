package stringspro;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strSB=new StringBuffer("this is example of program");
		strSB.append("append method");
		System.out.println(strSB);
		
		StringBuffer strSB1=new StringBuffer("this is example of program");
		strSB1.insert(1,"java");
		System.out.println(strSB1);
		
		StringBuffer strSB2=new StringBuffer("this is example of program");
		strSB2.replace(1,3,"java");
		System.out.println(strSB2);
		
		StringBuffer strSB3=new StringBuffer("this is example of program");
		strSB3.delete(1,3);
		System.out.println(strSB3);
		
		StringBuffer strSB4=new StringBuffer("this is example of program");
		strSB4.reverse();
		System.out.println(strSB4);
		
		StringBuffer strSB5=new StringBuffer("this is example of program");
		strSB5.deleteCharAt(6);
		System.out.println(strSB5);
		
		StringBuffer strSB6=new StringBuffer("this is example of program");
		strSB6.setCharAt(8,'n');
		System.out.println(strSB6);

	}

}
