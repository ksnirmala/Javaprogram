package stringspro;

public class Vowelpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello How Are You";
        System.out.println("number of characters="+s.length());
        System.out.println("character at 2 nd position "+s.charAt(1));
        System.out.println("last character "+s.charAt(s.length()-2));
        int c=0;
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        	c++;	
        	}
        
        }
        System.out.println("number of voweis="+c);
	}

}
