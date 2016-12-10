package xiangR.composite;

import java.util.Iterator;

/**
 * @author xiangrui
 *
 */
public class MenuItem extends MenuComponent{
	
	String name;
	String description;
	boolean vegetarain;
	double price;
	
	public MenuItem(String name,
					String description, 
					boolean vegetarain,
					double price) {
		
		this.name = name;
		this.description = description;
		this.vegetarain = vegetarain;
		this.price = price;
	}	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public boolean isVegetarain() {
		return vegetarain;
	}
	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}

	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
}
