package demo;

import java.util.stream.IntStream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,2,1,4,7,7,4,3,1,8};
//		int min=nums[0];
//		for(int i=1;i<nums.length;i++) {
//			if(nums[i]<min)
//				min=nums[i];
//		}
//		System.out.println(min);
		System.out.println(IntStream.of(nums).min().getAsInt());
		int arr[] = IntStream.of(nums).distinct().toArray();
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println(IntStream.of(nums).count());	
		System.out.println(IntStream.of(nums).distinct().count());
		IntStream.of(nums).distinct().min().ifPresent(System.out::println);
	}

}
