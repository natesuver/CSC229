package csc229.dealership;

public abstract class Vehicle {

	protected String modelTrim;
	protected int year;
	protected double price;
    protected String tireBrand;
    protected String transmissionType;
    protected int topSpeed;
    //protected String entertainmentSystemManufacturer;
    protected String seatStyle;
    protected int modelYear;
    protected double oilCapacity;
    protected double gasTankSize;
    protected double milesPerGallon;
    
	

    // Getters and setters
    public String getModelTrim() {
        return modelTrim;
    }

    public void setModelTrim(String modelTrim) {
        this.modelTrim = modelTrim;
    }

    public int getPurchaseYear() {
        return year;
    }

    public void setPurchaseYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTireBrand() {
        return tireBrand;
    }

    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

 
    public String getSeatStyle() {
        return seatStyle;
    }

    public void setSeatStyle(String seatStyle) {
        this.seatStyle = seatStyle;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getOilCapacity() {
        return oilCapacity;
    }

    public void setOilCapacity(double oilCapacity) {
        this.oilCapacity = oilCapacity;
    }

    public double getGasTankSize() {
        return gasTankSize;
    }

    public void setGasTankSize(double gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }
    
	    
}
