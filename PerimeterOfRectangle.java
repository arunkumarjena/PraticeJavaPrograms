import java.util.*;
public class PerimeterOfRectangle {
	public static void main(String args[]) {
		double periOfRect, heightOfRect, widthOfRect;
		Scanner obj = new Scanner(System.in);
		System.out.println("****PERIMETER****");
		System.out.println("Enter height Of Rectangle :");
		heightOfRect = obj.nextDouble();
		System.out.println("Enter Widht of Rectangle :");
		widthOfRect = obj.nextDouble();
		periOfRect = 2*(heightOfRect+widthOfRect);
		System.out.print("Perimeter Of Rectangle is :"+periOfRect);
	}
}
