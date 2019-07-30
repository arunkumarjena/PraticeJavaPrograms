import java.util.Scanner;

public class MainOperations extends SearchVowel {
	void disp() {
		System.out.println("********VOWEL SEARCH FROM KEYWORD*********");

		System.out.println("Input word to Match For vowel");
		Scanner inputData = new Scanner(System.in);
		System.out.println(inputData);

	}
	public static void main(String args[]) {
		MainOperations obj = new MainOperations();
		obj.disp();

	}

}
