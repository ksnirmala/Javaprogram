package stringspro;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123hj@er";
		int alphacount=0;
		int numcount=0;
		int splch=0;
		 for(int i=0;i<s.length();i++)		 
		 {
			 char ch=s.charAt(i);
		       if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
		       {
		    	   alphacount++;
		       }
		       else if((ch>='0')&&(ch<='9')) {
		    	   numcount++;
		       }
		       else
		       {
		    	   splch++;
		       }
		 }
		System.out.println("the alphacount="+alphacount);
		System.out.println("the numcount="+numcount);
		System.out.println("the specialcharactercount="+splch);

	}

}
