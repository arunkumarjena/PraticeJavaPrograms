import java.util.*;
class StudentDetail{
	String name;
	String branch;
	String sem;
	void DisplayOperation () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student Name :");
		name = input.nextLine();
		System.out.println("Enter Student Branch :");
		branch = input.nextLine();
		System.out.println("Enter Student Semester :");
		sem = input.nextLine();
		
	}
}
public class ClassProg3 {
	public static void main(String args[]) {
		StudentDetail obj = new StudentDetail();
		obj.DisplayOperation();
		System.out.println("Student Name is :"+obj.name);
		System.out.println("Studet Branch is :"+obj.branch);
		System.out.println("Student Sem is :"+obj.sem);
	}
}
