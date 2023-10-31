package demo1;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class StudentSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> student = new ArrayList<Student>();
		student.add(new Student(2024,"Sowmini"));
		student.add(new Student(2025,"Sona"));
		student.add(new Student(2026,"Sangeetha"));
		student.add(new Student(2027,"Sneha"));
		student.add(new Student(2028,"Elakkiya"));
		student.add(new Student(2028,"Elakkiya"));
		Iterator i = student.iterator();
		System.out.println("\nList of students - unsorted data:");
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("\nList of students - sorted data:");
		Collections.sort(student);
		for(Student s: student)
			System.out.println(s);
	}

}
