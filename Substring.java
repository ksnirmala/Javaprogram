package stringspro;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="hello world";
        System.out.println(s.substring(3));
     
        System.out.println(s.substring(3,8));
        System.out.println(s.substring(5));
        System.out.println(s.substring(s.length()-1));
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.indexOf(s.charAt(6)));
        System.out.println(s.indexOf('z'));
        System.out.println(s.indexOf('o'));
        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.indexOf("world"));
        System.out.println(s.contains("hello word"));
	}

}
