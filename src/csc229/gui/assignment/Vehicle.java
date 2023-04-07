package csc229.gui.assignment;

public class Vehicle {
	public Vehicle (String input) {
		this.setModelName(input.split(",")[0]);
		String price = input.split(",")[1];
		this.setPrice(Double.parseDouble(price));
	}
	private String ModelName;
	private double Price;
	
	public String getModelName() {
        return ModelName;
    }
    
    public void setModelName(String modelName) {
        ModelName = modelName;
    }
    
    public double getPrice() {
        return Price;
    }
    
    public void setPrice(double price) {
        Price = price;
    }
}
