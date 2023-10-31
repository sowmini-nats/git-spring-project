package demo;

import java.util.Comparator;



public class BookCompareAuthor implements Comparator<BookData> {

 

	@Override

	public int compare(BookData o1, BookData o2) {

		// TODO Auto-generated method stub

		return o1.getAuthor().compareTo(o2.getAuthor());

	}

 

}