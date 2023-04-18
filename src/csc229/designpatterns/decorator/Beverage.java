package csc229.designpatterns.decorator;


public abstract class Beverage implements IBeverage {
	String description = "Unknown Beverage";
  
	@Override
	public String getDescription() {
		return description;
	}
 
	@Override
	public abstract double cost();
	@Override
	public void PrintOrder() {
        System.out.println("Drink: " + this.getDescription()  + ", Price: $" + String.format("%.2f", this.cost()) );
    }
	@Override
	public String GetOrder() {
        return this.getDescription()  + ", Price: $" + String.format("%.2f", this.cost());
    }
}
