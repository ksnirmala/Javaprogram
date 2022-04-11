package stringspro;

public class Numberofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="Hello How Are You";
		 int c=0;
		 for(int i=0;i<s.length()-1;i++) {
		 if(s.charAt(i)==' ')
		 {
			c++;
		 }
	}
		 System.out.println("the number of words in a strings:"+(c+1));

}
}
