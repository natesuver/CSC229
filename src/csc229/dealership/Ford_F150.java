package csc229.dealership;

public class Ford_F150 extends Vehicle {

	  private String entertainmentSystemManufacturer;
    private double truckBedLength;
    private double towingCapacity;

    // Constructor
    public Ford_F150(String modelTrim, int year, double price, String tireBrand, String transmissionType,
                 int topSpeed, String entertainmentSystemManufacturer, String seatStyle, int modelYear,
                 double oilCapacity, double gasTankSize, double milesPerGallon, double truckBedLength,
                 double towingCapacity) {
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
        this.milesPerGallon = milesPerGallon;
        this.truckBedLength = truckBedLength;
        this.towingCapacity = towingCapacity;
    }
    public String getEntertainmentSystemManufacturer() {
        return entertainmentSystemManufacturer;
    }

    public void setEntertainmentSystemManufacturer(String entertainmentSystemManufacturer) {
        this.entertainmentSystemManufacturer = entertainmentSystemManufacturer;
    }

    
    public double getTruckBedLength() {
        return this.truckBedLength;
    }
    public double getTowingCapacity() {
        return this.towingCapacity;
    }
    public void setTruckBedLength(double truckBedLength) {
        this.truckBedLength = truckBedLength;
    }
    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
    
 // toString method
    @Override
    public String toString() {
        return "This is a Ford F150 -> " +
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
                "\nMiles Per Gallon: " + milesPerGallon +
                "\nTruck Bed Length: " + truckBedLength +
                "\nTowing Capacity: " + towingCapacity;
                
    }
}

