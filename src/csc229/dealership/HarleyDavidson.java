package csc229.dealership;

public class HarleyDavidson extends Motorcycle {
    // Constructor
    public HarleyDavidson(String modelTrim, int year, double price, String tireBrand, String transmissionType,
                 int topSpeed, int modelYear, double oilCapacity, double gasTankSize, double milesPerGallon,
                 String sidecarStyle) {
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
        this.sidecarStyle = sidecarStyle;
    }
  

 // toString method
    @Override
    public String toString() {
        return "This is a Harley -> " +
        		"\nModel Trim: " + modelTrim +
                "\nPurchase Year: " + year +
                "\nPrice: " + price +
                "\nTire Brand: " + tireBrand +
                "\nTransmission Type: " + transmissionType +
                "\nTop Speed: " + topSpeed +
                "\nModel Year: " + modelYear +
                "\nOil Capacity: " + oilCapacity +
                "\nGas Tank Size: " + gasTankSize +
                "\nMiles Per Gallon: " + milesPerGallon +
                "\nSidecar Style: " + sidecarStyle;
    }
    
}
