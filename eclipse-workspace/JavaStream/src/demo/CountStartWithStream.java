package demo;

import java.util.ArrayList;
import java.util.List;

public class CountStartWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Sowmini");
		list.add("Sneha");
		list.add("Sona");
		list.add("Sangeetha");
		list.add("Haritha");
		list.add("Deepthi");
		list.add("Hamsa");
		//list.stream().filter(e->e.startsWith("D")).count();
		System.out.println(list.stream().filter(e->e.startsWith("D")).count());
	}

}
