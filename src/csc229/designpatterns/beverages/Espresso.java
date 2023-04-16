package csc229.designpatterns.beverages;

public class Espresso extends Beverage {
    
    @Override
    public double cost() {
        return SizeCostAdjust(3.0 + super.cost());
    };
    @Override
    public String getDescription() {
		return "espresso";
	}
}