package demo;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
//		Queue<Integer> myQ = new LinkedList<Integer>();
//		myQ.add(10);
//		myQ.add(7);
//		myQ.add(13);
//		myQ.add(7);
//		myQ.add(23);
//		System.out.println(myQ);
//		myQ.poll();
//		myQ.poll();
//		System.out.println(myQ);
//		myQ.offer(3);
//		myQ.add(6);
//		System.out.println(myQ);
//		myQ.poll();
//		myQ.poll();
//		System.out.println(myQ);
		
		Queue<Integer> myQ = new PriorityQueue<Integer>();
		myQ.add(10);
		myQ.add(7);
		myQ.add(13);
		myQ.add(7);
		myQ.add(23);
		System.out.println(myQ);
		myQ.poll();
		myQ.poll();
		System.out.println(myQ);
		myQ.offer(3);
		myQ.offer(6);
		System.out.println(myQ);
		myQ.poll();
		myQ.poll();
		System.out.println(myQ);
	}

}
