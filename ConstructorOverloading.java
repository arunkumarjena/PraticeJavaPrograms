class Demo {
	int num1;
	int num2;
	String operation;
	public Demo( ) {
		int num1 = 0;
		int num2 = 0;
		operation = "Arun";
	}
	public Demo(int i) {
		int num1 = i;
		int num2 = 0;
		operation = "Nothing";
	}
	public Demo(int i, int j) {
		int num1 = i;
		int num2 = j;
		operation = "Nothing";
	}
	public Demo(int i, int j, String op) {
		int num1 = i;
		int num2 = j;
		operation = op;
	}
}
public class ConstructorOverloading {
	public static void main (String args[]) {
		Demo obj = new Demo(2,3,"Arun");
	}
}
