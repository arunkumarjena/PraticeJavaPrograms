class Calc {
	int num1;
	int num2;
	int result;

	void operation() {
		result = num1+num2;
	}
}

public class ClassProg2 {
	public static void main(String args[]) {
		Calc obj = new Calc(); //knows something and does something
		obj.num1 = 10;
		obj.num2 = 20;
		obj.operation();
		System.out.println("The sum is :"+obj.result);
	}
}
