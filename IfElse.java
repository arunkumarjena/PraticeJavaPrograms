//if-else-if Ladder
public class IfElse {
	public static void main(String args[]) {
		int month = 7;
		String season;
		if(month == 12 || month == 1 || month == 2)
			season = "winter";
		else if(month == 3 || month == 4 || month == 5)
			season = "spring";
		else if(month == 3 || month == 4 || month == 7)
			season = "summer";
		else if(month == 7 || month == 7 || month == 7)
			season = "autumn";
		else
			season = "Bogus Month";
		System.out.println("April is "+season+".");
	}
}
