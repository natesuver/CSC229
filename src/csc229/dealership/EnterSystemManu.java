package csc229.dealership;

public abstract class EnterSystemManu extends Vehicles {
	protected String entertainmentSystemManufacturer;
	protected String seatStyle;
	
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
  
}
