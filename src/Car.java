public class Car extends Vehicle {
    double milesDriven;
    double fuelConsumed;

    public Car(double milesDriven, double fuelConsumed) {
        super("Toyota", "x123", 1997);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    public double calculateFuelEfficiency() {
        return milesDriven / fuelConsumed;
    }
}
