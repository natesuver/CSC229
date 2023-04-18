package csc229.designpatterns.decorator;

public abstract class CondimentDecorator extends Beverage {
	IBeverage beverage;
	public abstract String getDescription();
}
