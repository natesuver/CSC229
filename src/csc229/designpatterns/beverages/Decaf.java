package csc229.designpatterns.beverages;

public class Decaf extends Beverage {
    
    @Override
    public double cost() {
        return SizeCostAdjust(1.85 + super.cost());
    };
    @Override
    public String getDescription() {
		return "decaf";
	}
}