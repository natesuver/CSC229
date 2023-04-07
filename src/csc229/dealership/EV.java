package csc229.dealership;

public abstract class EV extends Vehicle {

	protected double milesPerKilowattHour;

    public double getMilesPerKilowattHour() {
        return milesPerKilowattHour;
    }

    public void setMilesPerKilowattHour(double milesPerKilowattHour) {
        this.milesPerKilowattHour = milesPerKilowattHour;
    }
}
