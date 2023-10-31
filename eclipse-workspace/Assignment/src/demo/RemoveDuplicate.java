package demo;
import java.util.*;
import java.lang.reflect.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		int total;
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total numbers: ");
		total = sc.nextInt();
		int[] arr = new int[total];
		int arr2[] = new int [total];
		for(int i=0;i<total;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array:");
		for(int i:arr)
		System.out.println(i);
		
		for(int i=0;i<total;i++) {
			int count=0;
			for(int j=i+1;j<total;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			arr2[i]=count;
			if(count==0)
				n++;
				
		}
		int arr3[] = new int [n];

		System.out.println("Counting duplicate entries:");
		for(int d:arr2)
			System.out.println(d);
		
		for(int i=0;i<total;i++) {
			if(arr2[i]==0)
				arr3[--n]=arr[i];
		}
		
		System.out.println("After removing duplicate entries:");
		for(int e:arr3)
			System.out.println(e);

	}
}
