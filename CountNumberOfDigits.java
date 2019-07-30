import java.util.*;
public class CountNumberOfDigits {
	public static void main(String args[]){
		int num, count=0;
		System.out.println("Ener number :");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		while(num > 0) {
			num = num / 10;
			count = count + 1; 
		}
		System.out.println(count);
	}
}
