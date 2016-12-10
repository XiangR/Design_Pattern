package xiangR.factory;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		name = "Chicago style Suce and Cheese Pizza";
		dough = "Extra Crust Dough";
		sauce = "Plum Tomato ";
		
		toppings.add("Shreed Mozzarella Cheese");
	}
	
	void cut() {
		System.out.println("Cutting the pizza");
	}
}
