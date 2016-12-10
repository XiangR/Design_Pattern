package xiangR.factory;

public class ChicagoPizzaStore extends PizzaStore{

	Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}
		
		return null;
	}

}
