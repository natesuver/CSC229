package csc229.designpatterns.beverages;

public class HouseBlend extends Beverage {
    
    @Override
    public double cost() {
        return SizeCostAdjust(2.0 + super.cost());
    };
    @Override
    public String getDescription() {
		return "House Blend";
	}
}
