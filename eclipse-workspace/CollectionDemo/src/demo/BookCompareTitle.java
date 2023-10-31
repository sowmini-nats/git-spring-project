package demo;

import java.util.Comparator;



public class BookCompareTitle implements Comparator<BookData> {

 

	@Override

	public int compare(BookData o1, BookData o2) {

		// TODO Auto-generated method stub

		return o1.getTitle().compareTo(o2.getTitle());

	}

 

}
