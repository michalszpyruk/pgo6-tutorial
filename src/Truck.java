public class Truck extends Vehicle {
    double milesDriven;
    double fuelConsumed;
    double cargoWeight;

    Truck(double milesDriven, double fuelConsumed, double cargoWeight) {
        super("Peugeot", "501", 2005);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }
}
