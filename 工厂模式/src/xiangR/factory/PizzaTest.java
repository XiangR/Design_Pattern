package xiangR.factory;

public class PizzaTest {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza = nyStore.createPizza("cheese");
		
		PizzaStore chStore = new ChicagoPizzaStore();
		Pizza pizza2 = chStore.createPizza("cheese");
		System.out.println(pizza.name + pizza2.name);
		
		
		
	}
}
