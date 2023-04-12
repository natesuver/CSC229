package csc229.dealership;

public class Audi extends Vehicle {
/* This is my big change give me an A plz */

    private int year;
    private double price;
    private String tireBrand;
    private String transmissionType;
    private int topSpeed;
    private String entertainmentSystemManufacturer;
    private String seatStyle;
    private int modelYear;
    private double oilCapacity;
    private double gasTankSize;
    private double sunroofSize;
    private double milesPerGallon;

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

    public String getEntertainmentSystemManufacturer() {
        return entertainmentSystemManufacturer;
    }

    public void setEntertainmentSystemManufacturer(String entertainmentSystemManufacturer) {
        this.entertainmentSystemManufacturer = entertainmentSystemManufacturer;
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

    public double getSunroofSize() {
        return sunroofSize;
    }

    public void setSunroofSize(double sunroofSize) {
        this.sunroofSize = sunroofSize;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

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
