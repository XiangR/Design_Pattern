package xiangR.decker.impl;

import xiangR.decker.Beverage;
import xiangR.decker.CondimentDecorator;

public class MoCha extends CondimentDecorator{
	
	Beverage beverage;

	public MoCha(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", MoCha";
	}

	public double cast() {
		return .20 + beverage.cast();
	}

}
