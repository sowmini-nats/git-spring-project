package demo3;
import java.util.Scanner;
public class TreeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String rollno;
		Student student = new Student();
		student.setNames();
		System.out.println("List of all students:");
		student.printNames();
		System.out.println("Enter a rollno to get the student name");
		rollno=sc.next();
		student.getName(rollno);
		System.out.println("Total  number of students:");
		student.printSize();
		System.out.println("Enter the student rollno to remove:");
		rollno=sc.next();
		student.remove(rollno);
		System.out.println("List of all students using keySet:");
		student.printNamesKeySet();
	}

}
