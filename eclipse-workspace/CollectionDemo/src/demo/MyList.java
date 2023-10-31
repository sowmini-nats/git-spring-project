package demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MyList {
	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add(10);
		System.out.println(myList);
		myList.add(1,"Sowmini");
		System.out.println(myList);
		myList.add("Nandakkumar");
		System.out.println(myList);
		myList.set(0, 1);
		System.out.println(myList);
		System.out.println(myList.indexOf("Nandakkumar"));
		System.out.println(myList.contains("Sowmini"));
		myList.remove(0);
		System.out.println(myList);
		myList.add(0,1);
		System.out.println(myList);
		System.out.println("\nIterating using for loop");
		for(Object i: myList)
			System.out.println(i);
		System.out.println("\nIterating using iterator");
		Iterator iobj = myList.iterator();
		while(iobj.hasNext())
			System.out.println(iobj.next());
		List<Integer> myList1 = new ArrayList<>();
		myList1.add(1);
		myList1.add(2);
		myList1.add(3);
		int sum=0;
		for(Integer i: myList1)
			sum+=i;
		System.out.println("\nSum of all integers: ");
		System.out.println(sum);
	}
}
