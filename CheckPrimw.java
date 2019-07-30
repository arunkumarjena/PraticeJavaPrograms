import java.util.*;
public class CheckPrimw {
	public static void main(String args[]) {
		int input;
		boolean isPrime = true;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number :");
		input = obj.nextInt();
		for(int i=2; i <= input/2; i++) {
			System.out.println(i);
			if(input % i == 0) {
				System.out.println(i);
				isPrime = false;
				break;
			}
		}
		if(isPrime) System.out.println("Prime");
		else System.out.println("Not Prime");
	}
}
