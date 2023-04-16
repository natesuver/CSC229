package csc229.designpatterns.decorator;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}
