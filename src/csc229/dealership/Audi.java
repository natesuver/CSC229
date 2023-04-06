package csc229.dealership;

public class Audi extends RoofVehicles {
    // Constructor
    public Audi(String modelTrim, int year, double price, String tireBrand, String transmissionType, int topSpeed,
                String entertainmentSystemManufacturer, String seatStyle, int modelYear, double oilCapacity,
                double gasTankSize, double sunroofSize, double milesPerGallon) {
        this.modelTrim = modelTrim;
        this.year = year;
        this.price = price;
        this.tireBrand = tireBrand;
        this.transmissionType = transmissionType;
        this.topSpeed = topSpeed;
        this.entertainmentSystemManufacturer = entertainmentSystemManufacturer;
        this.seatStyle = seatStyle;
        this.modelYear = modelYear;
        this.oilCapacity = oilCapacity;
        this.gasTankSize = gasTankSize;
        this.sunroofSize = sunroofSize;
        this.milesPerGallon = milesPerGallon;
    }

    // Getters and setters
   
    
    @Override
    public String toString() {
        return "This is an Audi -> " +
        		"\nModel Trim: " + modelTrim +
                "\nPurchase Year: " + year +
                "\nPrice: " + price +
                "\nTire Brand: " + tireBrand +
                "\nTransmission Type: " + transmissionType +
                "\nTop Speed: " + topSpeed +
                "\nEntertainment System Manufacturer: " + entertainmentSystemManufacturer +
                "\nSeat Style: " + seatStyle +
                "\nModel Year: " + modelYear +
                "\nOil Capacity: " + oilCapacity +
                "\nGas Tank Size: " + gasTankSize +
                "\nSunroof Size: " + sunroofSize +
                "\nMiles Per Gallon: " + milesPerGallon;
        
    }
   
}
