package xiangR.decker.impl;

import xiangR.decker.Beverage;
import xiangR.decker.CondimentDecorator;

public class Whip extends CondimentDecorator{
	
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cast() {
		return .15 + beverage.cast();
	}

}
