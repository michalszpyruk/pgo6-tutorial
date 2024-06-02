public class Main {
    public static void main(String[] args) {
        Car car = new Car(500, 250);
        Truck truck = new Truck(500, 250, 1200);

        System.out.println("Fuel consumption of car: " + String.format("%.2f", car.calculateFuelEfficiency()));
        System.out.println("Fuel consumption of truck: " + String.format("%.2f", truck.calculateFuelEfficiency()));
    }
}