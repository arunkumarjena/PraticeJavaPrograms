class Hello {
	int num1;
	int num2;
	int result;
	public Hello(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}
public class ThisKeyWord {
	public static void main(String args[]) {
		Hello obj = new Hello(8,8);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}
