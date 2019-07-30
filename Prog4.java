import java.util.*;
public class Prog4 {
	public static void main(String args[]) {
		String value = "Arun";
		String data;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String Arun: ");
		data = input.next();
		if (data == value) {
			System.out.println("Hey Arun...!!!!");
		}else {
			System.out.println("It seems you have to match the name");
		}
	}
}
