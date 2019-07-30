import java.util.*;
public class Prog3 {
	static String name;
	static int num;
	static String data;
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Please give input as any number :");
		num = obj.nextInt();
//		String s = String.valueOf(num);
		System.out.println("You Have entered :"+num);
		if(num == 1) {
			System.out.println("Hello Arun Welcome to Java Programming....!!!!");
		}else {
			System.out.println("You have not Entered 1");
		}
	}
}
