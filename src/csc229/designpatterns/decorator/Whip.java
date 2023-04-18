package csc229.designpatterns.decorator;

public class Whip extends CondimentDecorator {
	public Whip(IBeverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
