package csc229.dealership;

public class LateModelToyota extends Vehicles {
    // Constructor
    public LateModelToyota() {
    	
    }
    public LateModelToyota(String modelTrim, int year, double price, String tireBrand, String transmissionType,
                          int topSpeed, int modelYear, double oilCapacity, double gasTankSize, double milesPerGallon) {
        this.modelTrim = modelTrim;
        this.year = year;
        this.price = price;
        this.tireBrand = tireBrand;
        this.transmissionType = transmissionType;
        this.topSpeed = topSpeed;
        this.modelYear = modelYear;
        this.oilCapacity = oilCapacity;
        this.gasTankSize = gasTankSize;
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public String toString() {
    	return "This is a Late Model Toyota -> " +
        		"\nModel Trim: " + modelTrim +
                "\nPurchase Year: " + year +
                "\nPrice: " + price +
                "\nTire Brand: " + tireBrand +
                "\nTransmission Type: " + transmissionType +
                "\nTop Speed: " + topSpeed +
                "\nModel Year: " + modelYear +
                "\nOil Capacity: " + oilCapacity +
                "\nGas Tank Size: " + gasTankSize +
                "\nMiles Per Gallon: " + milesPerGallon;
    }
}
