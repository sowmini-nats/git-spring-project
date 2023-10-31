package day6;

import java.util.*;

import day3.InvalidPizzaSizeException;
import day3.InvalidPizzaTypeException;
import day3.ItalianPizza;
import day3.MexicanPizza;
import day3.Pizza;
public class Reception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza ip;
		int total=0;
		System.out.print("Enter bill number: ");
        int billNo = sc.nextInt();
        System.out.print("Enter the customer name: ");
        String custName = sc.next();
        Date date = new Date();
        Vector<Pizza> pizza = new Vector<Pizza>();
        int choice=0;
        while(true) {
        	System.out.println("Select the option:\n1.Italian Pizza\n2.Mexican Pizza\n3.Exit...");
         	choice = sc.nextInt();
        	if(choice==3) {
        		System.out.println("Thank you...");
        		break;
        	}
        	switch(choice) {
        	case 1:{
	        	System.out.println("Enter pizza type: veg or non-veg");
	    		String type = sc.next();
	    		System.out.println("Enter pizza name:");
	    		String name = sc.next();
	    		System.out.println("Enter added toppings: Add toppings or enter 'No'");
	    		String toppings = sc.next();
	    		System.out.println("Enter pizza size: small or medium");
	    		String size = sc.next();
	    		System.out.println("Enter preparation time:");
	    		float timeForPreparation = sc.nextFloat();
	    		try {
	    			ip = new ItalianPizza(type,toppings,name,timeForPreparation,size);
	    			pizza.add(ip);
	    			total+=ip.calculateCost();
	    			System.out.println("");
	    		} catch (InvalidPizzaTypeException | InvalidPizzaSizeException e) {
	    			System.out.println(e.getMessage());
	    		}
	    		break;
        	}
        	case 2:{
        		System.out.println("Enter pizza type: veg or non-veg");
	    		String type = sc.next();
	    		System.out.println("Enter pizza name:");
	    		String name = sc.next();
	    		System.out.println("Enter added toppings: Add toppings or enter 'No'");
	    		String toppings = sc.next();
	    		System.out.println("Enter pizza size: small or medium");
	    		String size = sc.next();
	    		System.out.println("Enter preparation time:");
	    		float timeForPreparation = sc.nextFloat();
	    		try {
	    			ip = new MexicanPizza(type,toppings,name,timeForPreparation,size);
	    			pizza.add(ip);
	    			total+=ip.calculateCost();
	    			System.out.println("");
	    		} catch (InvalidPizzaTypeException | InvalidPizzaSizeException e) {
	    			System.out.println(e.getMessage());
	    		}
				break;
        	}

        }
        }
        Bill b = new Bill(billNo, custName, date, total, pizza);
        System.out.println(b);
        Vector<Pizza> pizzas = b.getPizza();
        System.out.println("Enter pizza type");
        String type = sc.next();
        pizzas.stream().filter(e->e.getType().equals(type)).forEach(System.out::println);
        
	}

}
