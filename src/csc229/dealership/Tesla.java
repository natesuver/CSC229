package csc229.dealership;

public class Tesla {

    private String modelTrim;
    private int year;
    private double price;
    private String tireBrand;
    private int topSpeed;
    private String entertainmentSystemManufacturer;
    private String seatStyle;
    private int modelYear;
    private double sunroofSize;
    private boolean selfDriving;
    private double milesPerKilowattHour;

    // Constructor
    public Tesla() {
    	
    }
    public Tesla(String modelTrim, int year, double price, String tireBrand, int topSpeed,
                 String entertainmentSystemManufacturer, String seatStyle, int modelYear,
                 double sunroofSize, boolean selfDriving, double milesPerKilowattHour) {
        this.modelTrim = modelTrim;
        this.year = year;
        this.price = price;
        this.tireBrand = tireBrand;
        this.topSpeed = topSpeed;
        this.entertainmentSystemManufacturer = entertainmentSystemManufacturer;
        this.seatStyle = seatStyle;
        this.modelYear = modelYear;
        this.sunroofSize = sunroofSize;
        this.selfDriving = selfDriving;
        this.milesPerKilowattHour = milesPerKilowattHour;
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

    public double getSunroofSize() {
        return sunroofSize;
    }

    public void setSunroofSize(double sunroofSize) {
        this.sunroofSize = sunroofSize;
    }

    public boolean isSelfDriving() {
        return selfDriving;
    }

    public void setSelfDriving(boolean selfDriving) {
        this.selfDriving = selfDriving;
    }

    public double getMilesPerKilowattHour() {
        return milesPerKilowattHour;
    }

    public void setMilesPerKilowattHour(double milesPerKilowattHour) {
        this.milesPerKilowattHour = milesPerKilowattHour;
    }

 // toString method
    @Override
    public String toString() {
        return "Model Trim: " + modelTrim +
                "\nYear: " + year +
                "\nPrice: " + price +
                "\nTire Brand: " + tireBrand +
                "\nTop Speed: " + topSpeed +
                "\nEntertainment System Manufacturer: " + entertainmentSystemManufacturer +
                "\nSeat Style: " + seatStyle +
                "\nModel Year: " + modelYear +
                "\nSunroof Size: " + sunroofSize +
                "\nSelf-Driving: " + selfDriving +
                "\nMiles Per Kilowatt Hour: " + milesPerKilowattHour;
    }
}
