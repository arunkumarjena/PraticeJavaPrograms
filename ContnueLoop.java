
public class ContnueLoop {
	public static void main(String args[]) {
		for(int i=1; i<=10; i++) {
//			do {
//				continue;
//			} while (i == 7);
			if (i == 7) {
				continue;
			}
			System.out.println("The value of i is :"+i);
		}
	}
}
