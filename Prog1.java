import java.util.*;
public class Prog1 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int sal,b;
		System.out.println("Enter Your Salary :");
		sal = obj.nextInt();
		if (sal <= 10000) {
			b = (sal*10)/100;
			sal = sal+b;
			System.out.println("Your salary is :"+sal);
		}
	}
}
