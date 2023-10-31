package Demo;
import java.util.Scanner;
public class MenuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sum=0,discount;
		Menu[] menu = new Menu[5];
		menu[0] = new Menu("Stamppot Boerenkool",564.65,45,20.5,0.5);
		menu[1] = new Menu("Metworst",345,12,10.99,0);
		menu[2] = new Menu("Hutspot",560.4,65,30.9,1);
		menu[3] = new Menu("Biefstuk",780,46,50.34,2);
		menu[4] = new Menu("Kibbeling",450.4,23,20.78,1);
		for(Menu data:menu) {
			data.displayMenuDetails();
		}
		for(Menu data:menu) {
			if(data.getCookingTime()<30) {
				System.out.println(data.getName()+" cooks in "+data.getCookingTime());
			}
		}
		for(Menu data:menu) {
			sum+=data.getPrice();
		}
		System.out.println("The total price is "+sum);
		if(sum>65) {
			double value = 0.1*sum;
			discount = sum - value;
			System.out.println("The discounted price is "+discount);
		}
	}
}
