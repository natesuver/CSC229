package csc229.designpatterns.beverages;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
    protected boolean milk;
    protected boolean soy;
    protected boolean mocha;
    protected boolean whip;
    protected String size;

	public String getDescription() {
		return description;
	}
 
    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }


    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

	public double cost() {
        double netCost = 0;
        if (hasSoy()) {
            netCost+=.20;
        }
        if (hasMocha()) {
            netCost+=.50;
        }
        if (hasMilk()) {
            netCost+=.10;
        }
        if (hasWhip()) {
            netCost+=.50;
        }
       
        return netCost;
    };

    public double SizeCostAdjust(double basePrice) {
        switch (size) {
            case "small":
                return basePrice*.8;
            case "large":
                return basePrice*1.2;
            default:
        }
        return basePrice;
    }
    public void PrintOrder() {
        System.out.println("Size: " + this.getSize() + ", Drink: " + this.getDescription()  + ", Price: $" + this.cost() + ", Add Whip?: " + this.hasWhip());
    }

}
