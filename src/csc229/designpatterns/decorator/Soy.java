package csc229.designpatterns.decorator;

public class Soy extends CondimentDecorator {
	public Soy(IBeverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
