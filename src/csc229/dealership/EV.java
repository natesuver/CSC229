package csc229.dealership;

public abstract class EV extends RoofVehicles {
	protected boolean selfDriving;
    protected double milesPerKilowattHour;
    
    
    
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
    

}
