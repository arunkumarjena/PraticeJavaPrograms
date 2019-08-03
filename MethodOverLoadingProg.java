class Casio {
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void add(float i,float j,float k) {
		System.out.println(i+j+k);
	}
	public void add(double i, double j) {
		System.out.println(i+j);
	}
}
public class MethodOverLoadingProg {
	public static void main(String args[]) {
		Casio obj = new Casio();
		obj.add(7, 9);
		obj.add(30, 20, 10);
		obj.add(12, 34);
	}
}
