package day3;
import java.util.Scanner;
public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItalianPizza ip;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pizza type: veg or non-veg");
		String type = sc.next();
		System.out.println("Enter added toppings: Add toppings or enter 'No'");
		String toppings = sc.next();
		System.out.println("Enter pizza size: small or medium");
		String size = sc.next();
		System.out.println("Enter pizza name:");
		String name = sc.next();
		System.out.println("Enter preparation time:");
		float timeForPreparation = sc.nextFloat();
		try {
			ip = new ItalianPizza(type,toppings,name,timeForPreparation,size);
			System.out.println(ip);
		} catch (InvalidPizzaTypeException | InvalidPizzaSizeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
