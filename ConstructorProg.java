class Constructor{
	int num1;
	int num2;
	int result;
	public Constructor() {
		num1 = 5;
		num2 = 5;
	}
	public Constructor(int n) {
		num1 = n;
		num2 = n;
		System.out.println(n);
	}
	public Constructor(double d, int b) {
		num1 = (int) d;
		num2 = b;
	}
}
public class ConstructorProg {
	public static void main(String args[]) {
		Constructor obj = new Constructor(9.5,8);
		System.out.println(obj.num1);
	}
}
