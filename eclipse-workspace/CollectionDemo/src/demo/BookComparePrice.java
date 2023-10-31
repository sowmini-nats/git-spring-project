package demo;
import java.util.Comparator;



public class BookComparePrice implements Comparator<BookData> {

 

	@Override

	public int compare(BookData o1, BookData o2) {

		// TODO Auto-generated method stub

		if( o1.getPrice()==o2.getPrice())

			return 0;

		else if(o1.getPrice()>o2.getPrice())

			return 1;

		else

			return -1;

	}

 

}
