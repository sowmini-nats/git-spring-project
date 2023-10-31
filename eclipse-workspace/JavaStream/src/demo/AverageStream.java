package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class AverageStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(34);
		list.add(23);
		list.add(8);
		list.add(100);
		int sum = list.stream().reduce((a,b)->a+b).get();
		double average = sum/list.stream().count();
		System.out.println(average);
		
	}

}
