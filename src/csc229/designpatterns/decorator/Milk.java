package csc229.designpatterns.decorator;

public class Milk extends CondimentDecorator {
	public Milk(IBeverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
