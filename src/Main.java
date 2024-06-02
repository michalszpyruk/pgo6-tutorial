public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "x123", 2014, 1000, 500);
        Truck truck = new Truck("Peugeot", "501", 2005, 1000, 500, 3102);
        System.out.println("Fuel consumption of car: " + String.format("%.2f", car.calculateFuelEfficiency()));
        System.out.println("Fuel consumption of truck: " + String.format("%.2f", truck.calculateFuelEfficiency()));
    }
}