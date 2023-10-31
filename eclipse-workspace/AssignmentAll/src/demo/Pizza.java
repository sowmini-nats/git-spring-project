package demo;


public class Pizza {
	private String type ;
	private String toppings;
	private String name;
	private float timeForPreparation;
	Pizza(){
		type="veg";
		toppings="No";
		name="unknown";
		timeForPreparation=0;
	}
	
	Pizza(String type, String toppings, String name, float timeForPreparation) {
		if(!type.equals("veg")&&!type.equals("non-veg")) {
			System.out.println("Invalid type");
				return;
		}
		this.type = type;
		this.toppings = toppings;
		this.name = name;
		this.timeForPreparation = timeForPreparation;
	}
	public String toString() {
//		return "Type: "+type+"\nToppings: "+toppings+"\nName: "
//	+name+"\nPreparation Time: "+timeForPreparation;
		return type+" "+name+" Pizza with "+toppings+" which take "
		+timeForPreparation+" min for preparation.";
	}

}
