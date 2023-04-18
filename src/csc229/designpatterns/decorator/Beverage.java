package csc229.designpatterns.decorator;


public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
	public void PrintOrder() {
        System.out.println("Drink: " + this.getDescription()  + ", Price: $" + String.format("%.2f", this.cost()) );
    }
	public String GetOrder() {
        return this.getDescription()  + ", Price: $" + String.format("%.2f", this.cost());
    }
}
