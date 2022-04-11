package stringspro;

public class Onlynumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="123hj";
       boolean flag=true;
       for(int i=0;i<s.length();i++) {
       char ch=s.charAt(i);
       if(!(ch>='0'&& ch<='9'))
            {
    	   flag=false;
       
           }
       }
       if(flag==true)
       {
    	   System.out.println("string contains numeric");
       }
       else
       {
    	   System.out.println("string contains  non numeric");
      
       }
       
	}
}
