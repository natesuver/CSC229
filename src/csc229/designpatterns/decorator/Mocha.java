package csc229.designpatterns.decorator;


public class Mocha extends CondimentDecorator {
	public Mocha(IBeverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
