package demo;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenOdd {

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
		list.add(37);
		list.add(47);
		int sumOfEven = list.stream().filter(e->e%2==0).reduce((a,b)->a+b).get();
		System.out.println("Sum of even numbers: "+sumOfEven);
		int sumOfOdd = list.stream().filter(e->e%2!=0).reduce((a,b)->a+b).get();
		System.out.println("Sum of odd numbers: "+sumOfOdd);
	}

}
