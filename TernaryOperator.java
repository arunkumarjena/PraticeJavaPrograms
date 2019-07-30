
public class TernaryOperator {
//Ternary Operator
//	?: -> expr1:expr2
	public static void main(String args[]) {
		int i = 6;
		int j = 8;
		
//		Without ternary operator
//		if(i>j)
//			j=1;
//		else
//			j=2;
		j = i>j?5:6;
		System.out.println(j);
	}
}
