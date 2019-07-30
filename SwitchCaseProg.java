import java.util.*;

public class SwitchCaseProg {
	public static void main(String args[]) {
		int marks[] = new int[7];
		int i;
		float total = 0, avg;
		Scanner scanner = new Scanner(System.in);

		for (i = 0; i < 7; i++) {
			System.out.print("Enter Marks of Subject" + (i+1) + ":");
			marks[i] = scanner.nextInt();
			total = total + marks[i];
		}
		scanner.close();
		// Calculating average here
		avg = total / 6;
		System.out.print("The student Grade is: ");
		if (avg >= 80) {
			System.out.print("A");
		} else if (avg >= 60 && avg < 80) {
			System.out.print("B");
		} else if (avg >= 40 && avg < 60) {
			System.out.print("C");
		} else {
			System.out.print("D");
		}
	}
}
