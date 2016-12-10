package xiangR.decker.impl;

import xiangR.decker.Beverage;

public class Starbucks {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		beverage = new MoCha(beverage);
		beverage = new Whip(beverage);
	
		System.out.println(beverage.getDescription() + "The Sum is $" + beverage.cast());
	}
}
