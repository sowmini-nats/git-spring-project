package demo3;
import java.util.HashMap;
public class Student {
	private HashMap<String,String> empNames =new HashMap<String,String>();
	public void setNames() {
		empNames.put("2024","Sowmini");
		empNames.put("2025","Sona");
		empNames.put("2026","Sangeetha");
		empNames.put("2027","Sneha");
		empNames.put("2028","Elakkiya");
	}
	public void printNames() {
		for(String i:empNames.values())
			System.out.println(i);
	}
	public void getName( String key ) {
		System.out.println(empNames.get(key)); 
	}
	public void printNamesKeySet( ) {
		for(String i:empNames.keySet())
			System.out.println(empNames.get(i));
	}
	public void printSize( ) {
		System.out.println(empNames.size());
	}
	public void remove( String key ) {
		empNames.remove(key);
	}

}
