package demo;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(34);
		list.add(23);
		list.add(8);
		list.add(100);
		list.add(90);
		list.add(2);
		list.add(100);
		list.add(30);
		list.add(40);
		//System.out.println(list.stream().distinct().toList());
		System.out.println(list);
		List<Integer> newList = list.stream().distinct().toList();
		System.out.println(newList);
		
	}

}
