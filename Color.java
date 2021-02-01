
import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	    
	     System.out.print("Enter color code: ");

	     int codenumber;

	     codenumber = in.nextInt();
	     
	     switch (codenumber) {
	     case 1: 
	    	 System.out.println("Red");
	    	 break;
	    case 2:System.out.println("Blue");
	         break;
	    case 3:System.out.println("Green");
	         break;
	    case 4:System.out.println("orange");
	         break;
	    case 5:System.out.println("Yellow");
	         break;
	    case 6:System.out.println("White");
	          break;
	   default:System.out.println("Invalid Code");
	          break;
	 }
	}
}
