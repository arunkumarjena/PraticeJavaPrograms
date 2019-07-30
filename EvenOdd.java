import java.util.*;
public class EvenOdd {
	public static void main(String args[]) {
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number to Check even or odd :");
		num = obj.nextInt();
		if(num==0) {
			System.out.println("Nothing..");
		}else if(num%2==0) {
			System.out.println("The Number is Even");
		
		} else {
			System.out.println("The Number is Odd");
		}
	}
}
