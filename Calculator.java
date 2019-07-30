import java.util.*;
public class Calculator {
	public static void main(String args[]) {
		double firstnum;
		double secondnum;
		Scanner obj = new Scanner(System.in);
		System.out.println("*******CALCULATOR*********");
		System.out.println("Enter First Number :");
		firstnum = obj.nextDouble();
		System.out.println("Enter Second Number :");
		secondnum = obj.nextDouble();
		System.out.println("Select Your Operation :");
		System.out.println("Addition-a: Substraction-b: Multiplication-c Division-d");
		char ch = obj.next().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("Addition of Number is :"+(firstnum+secondnum));
			break;
		case 'b':
			System.out.println("Substraction of Number is :"+(firstnum-secondnum));
			break;
		case 'c':
			System.out.println("Multiplication of Number is :"+(firstnum*secondnum));
			break;
		case 'd':
			System.out.println("Division of Number is :"+(firstnum/secondnum));
			break;
		default:
			System.out.println("You have choose invalid operator :");
			break;
		}
		
	}
}
