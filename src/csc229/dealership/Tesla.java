package csc229.dealership;

public class Tesla extends EV{
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
