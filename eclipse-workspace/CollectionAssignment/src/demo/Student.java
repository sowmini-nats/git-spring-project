package demo;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Student {
	private ArrayList<String> names = new ArrayList<String>();
	public void setNames() {
		names.add("Sowmini");
		names.add("Sangeetha");
		names.add("Sona");
		names.add("Sneha");
		names.add("Elakkiya");
	}
	public void searchName(String name) {
		if(names.contains(name))
			System.out.println("The name "+name+" exists");
		else 
			System.out.println("The name "+name+" do not exists");
	} 
	public void searchName(int index) {
		System.out.println(names.get(index)); 
	}
	public void printNames( ) {
		Iterator i = names.iterator();
		System.out.println("\nThe student names are: ");
		while(i.hasNext())
			System.out.println(i.next());
	}
	public void removeName( String stuName ) {
		names.remove(stuName);
	}
	
}
