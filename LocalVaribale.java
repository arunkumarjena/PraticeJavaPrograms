public class LocalVaribale {
	//Global variable
	static int a = 10;
	static int b = 40;
	static int c;
	static void Test() {
		c = a+b;
		System.out.println(c);
	}
	public static void main(String args[]) {
//		int a = 10;
//		int b = 20;
//		int c = a+b;
		
		Test();
	}
}
