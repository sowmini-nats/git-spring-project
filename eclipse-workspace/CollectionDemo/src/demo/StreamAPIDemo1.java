package demo;

import java.util.ArrayList;

import java.util.List;

import java.util.Map;

import java.util.stream.Collectors;

import java.util.stream.IntStream;

import java.util.stream.Stream;

 

public class StreamAPIDemo1 {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int nums[]= {9,4,6,5,7,4};

//		int min=nums[0];

//		for(int i=1;i<nums.length;i++)

//			if(nums[i]<min) min=nums[i];

//		System.out.println(min);

		//int minValue=IntStream.of(nums).min().getAsInt();

		//System.out.println( IntStream.of(nums).distinct().count());

		//int[] newArray=

		IntStream.of(nums).distinct().map(e->e*2).forEach(System.out::println);

		 //for(int i:newArray)System.out.println(i);

		int data=IntStream.of(nums).distinct().map(e->e*2).reduce((a,b)->a+b).getAsInt();

		System.out.println(data);

		List<String> strings=new ArrayList<String>();

		strings.add("hello");

		strings.add("welcome");

		strings.add("world");

		strings.add("hi");

		String list= strings.stream().map(e->e.toUpperCase())

		.sorted()

		.findFirst().get();

		System.out.println(list);

	}

}