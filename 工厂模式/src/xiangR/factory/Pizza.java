package xiangR.factory;

import java.util.*;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Tossing toppings.");
		for(Iterator<String> it = toppings.iterator(); it.hasNext(); ) {
			System.out.println("  " + it.next());
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut() {
		System.out.println("Cutting the pizza ");
	}
	void box() {
		System.out.println("Place pizza in official PizzaStore box!");
	}
	
	public String getName() {
		return name;
	}
}
