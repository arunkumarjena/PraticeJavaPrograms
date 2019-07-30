import java.util.*;
public class AreaOfRectangle {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		double areaOfRect, heightOfRect, widthOfRect;
		System.out.println("******Area of Rectangle*******");
		System.out.println("Enter HeightOF the RectaNgle :");
		heightOfRect = obj.nextDouble();
		System.out.println("Enter WidthOf the RectaNgle :");
		widthOfRect = obj.nextDouble();
		areaOfRect = heightOfRect * widthOfRect;
		System.out.println("Area of the Rectangle is :"+areaOfRect);
		
	}
}
