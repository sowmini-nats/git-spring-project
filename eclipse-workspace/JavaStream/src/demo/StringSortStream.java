package demo;

import java.util.ArrayList;
import java.util.List;

public class StringSortStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Sowmini");
		list.add("Sneha");
		list.add("Sona");
		list.add("Sangeetha");
		list.add("Haritha");
		list.add("Deepthi");
		list.add("Sona");
		List<String> newList1 = list.stream().distinct().sorted().toList();
		List<String> newList2 = list.stream().distinct().sorted((a,b)->b.compareTo(a)).toList();
		System.out.println("Ascending order: "+newList1);
		System.out.println("Descending order: "+newList2);
	}

}
