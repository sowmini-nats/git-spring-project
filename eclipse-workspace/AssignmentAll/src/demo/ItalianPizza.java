package demo;

public class ItalianPizza extends Pizza{
	ItalianPizza(String type, String toppings, String name, float timeForPreparation){
		super(type,toppings,name,timeForPreparation);
	}
	public String toString() {
		return "Italian Pizza details are: "+super.toString();
	}
		
}
