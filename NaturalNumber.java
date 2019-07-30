import java.util.*;
public class NaturalNumber {
	public static void main(String args[]) {
		int i,n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number Range :");
		n = obj.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("Natural Numbers are :"+i);
		}
	}
}