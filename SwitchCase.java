import java.util.*;
public class SwitchCase {
	public static void main(String args[]) {
//		int  num;
		String words;
		Scanner obj = new Scanner(System.in);
		System.out.println("Input the Numbers upto 5 :");
//		num = obj.nextInt();
		words = obj.next();
		switch(words)
		{
//		case 1:
//			System.out.println("One");
//			break;
//		case 2:
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//			break;
//		case 4:
//			System.out.println("Five");
//			break;
//		case 5:
//			System.out.println("Six");
//			break;
		case "abc":
			System.out.println("One");
			break;
		case "def":
			System.out.println("Two");
			break;
		case "ghi":
			System.out.println("Three");
			break;
		case "jkl":
			System.out.println("Four");
			break;
		case "mno":
			System.out.println("Five");
			break;
		case "pqr":
			System.out.println("One");
			break;
		default:
			System.out.println("Does not exist");
		}
	}
}
