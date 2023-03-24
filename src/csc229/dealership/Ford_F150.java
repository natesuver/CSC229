package csc229.dealership;

public class Ford_F150 {

    private String modelTrim;
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
    private double milesPerGallon;
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

    // Getters and setters
    public String getModelTrim() {
        return modelTrim;
    }

    public void setModelTrim(String modelTrim) {
        this.modelTrim = modelTrim;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
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
                "\nYear: " + year +
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

