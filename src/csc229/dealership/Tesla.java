package csc229.dealership;

public class Tesla extends EV {
    
    private String entertainmentSystemManufacturer;
    private String seatStyle;

    private double sunroofSize;
    private boolean selfDriving;
    

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

   

    public String getEntertainmentSystemManufacturer() {
        return entertainmentSystemManufacturer;
    }

    public void setEntertainmentSystemManufacturer(String entertainmentSystemManufacturer) {
        this.entertainmentSystemManufacturer = entertainmentSystemManufacturer;
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


 // toString method
    @Override
    public String toString() {
        return "This is a Tesla -> " +
        		"\nModel Trim: " + modelTrim +
                "\nPurchase Year: " + year +
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
