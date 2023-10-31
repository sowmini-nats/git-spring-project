package demo;

import java.util.ArrayList;
import java.util.List;

public class SecondSmallestLargest {

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
		int small = list.stream().distinct().sorted().skip(1).findFirst().get();
		int large = list.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
		System.out.println(small);
		System.out.println(large);
	}

}
