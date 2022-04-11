package stringspro;

public class Onlyalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="cdsf";
	       boolean flag=true;
	       for(int i=0;i<s.length();i++) {
	       char ch=s.charAt(i);
	       if(!(ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
	            {
	    	   flag=false;
	       
	           }
	       else if (ch>='0'&& ch<='9'){
	    	   flag=true;
	       }
	       }
	       if(flag==true)
	       {
	    	   System.out.println("string contains alphabets");
	       }
	       else
	       {
	    	   System.out.println("string contains alphanumeric");
	      
	       }
	       
	}

}
