import java.util.*;
public class MidPoint {
	public static void main(String args[]) {
		double x1,x2,y1,y2;
		double midpoint;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter corresponid x1 points :");
		x1 = obj.nextDouble();
		System.out.println("Enter corresponid x2 points :");
		x2 = obj.nextDouble();
		System.out.println("Enter corresponid y1 points :");
		y1 = obj.nextDouble();
		System.out.println("Enter corresponid y2 points :");
		y2 = obj.nextDouble();
		
		midpoint = (x1+x2)/2;
		double midpoint1 = (y1+y2)/2;
		System.out.println("The midpoint is :"+midpoint+ " , "+midpoint1);
	}
}
