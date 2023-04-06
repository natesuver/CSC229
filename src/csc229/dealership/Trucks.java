package csc229.dealership;

public abstract class Trucks extends EnterSystemManu {
	protected double truckBedLength;
    protected double towingCapacity;
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
}
