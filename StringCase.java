package switchstmt;
import java.util.Scanner;
public class StringCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name;
		 Scanner input=new Scanner(System.in);
         System.out.println("*******MENU******");
         System.out.println("enter which course you want to join");
         System.out.println("java");
         System.out.println("python");
         System.out.println("oracle");
         name=input.next();
         switch(name)
         {
         case "java":
        	System.out.println("your course is java");
             break;
         case "python":
        	 System.out.println("your course is python");
             break;
         case "oracle":	
        	 System.out.println("your course is oracle");
             break;
         default:
         	System.out.println("invalid course");
            
         }
}
}