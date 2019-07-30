import java.util.*;
public class ReverseString {
	public static void main(String args[]) {
		System.out.println("Enter String :");
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Reverse String is :"+reverse);
	}
}
