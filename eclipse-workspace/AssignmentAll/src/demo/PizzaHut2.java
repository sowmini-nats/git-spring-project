package demo;
import java.util.Scanner;
public class PizzaHut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int option;
		while(true){
			System.out.println("Please select the option:\n1.Italian Pizza\n2.MexicanPizza\n3.Exit");
			option = sc.nextInt();
			if(option==3) {
				System.out.println("Thank You");
				break;
			}
			System.out.println("Enter pizza type: veg or non-veg");
			String type = sc.next();
			System.out.println("Enter pizza name:");
			String name = sc.next();
			System.out.println("Enter toppings:");
			String toppings = sc.next();
			System.out.println("Enter preparation time:");
			float timeForPreparation = sc.nextFloat();
			if(option==1) {
				ItalianPizza ip = new ItalianPizza(type,toppings,name,timeForPreparation);
				System.out.println(ip);
			}
			else if(option==2) {
				MexicanPizza mp = new MexicanPizza(type,toppings,name,timeForPreparation);
				System.out.println(mp);
			}
		}
		
	}

}
