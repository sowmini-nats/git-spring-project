package demo;

public class MexicanPizza extends Pizza{
	MexicanPizza(String type, String toppings, String name, float timeForPreparation){
		super(type,toppings,name,timeForPreparation);
	}
	public String toString() {
		return "Mexican Pizza details are: "+super.toString();
	}
		
}

