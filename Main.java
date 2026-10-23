public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        // Polymorphism using Parent as Reference, Upcasting
        Vehicle vehicle = new Car("Land Rover", "Defender", 2020, 4);
        vehicle.displayInfo();

        System.out.println(" ");

        // Polymorphism using Methods
        Car car1 = new Car("Land Rover", "Defender", 2020, 4);
        Car car2 = new Car("Toyota", "Corolla", 1995, 4);
        Car car3 = new Car("BMW", "Sedan", 2018, 4);
        Motorcycle motor = new Motorcycle("Honda", "ADV160", 2026, "Basta modagan");
        Truck truck = new Truck("Isuzu", "FRR90MS", 2026, 6);

        printDetails(car1);
        printDetails(car2);
        printDetails(car3);
        printDetails(motor);
        printDetails(truck);

        System.out.println(" ");

        // Polymorphism using Arrays
        Vehicle[] vehicles = {
            new Car("Land Rover", "Defender", 2020, 4),
            new Car("Toyota", "Corolla", 1995, 4),
            new Car("BMW", "Sedan", 2018, 4),
            new Motorcycle("Honda", "ADV160", 2026, "Basta modagan"),
            new Truck("Isuzu", "FRR90MS", 2026, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
        }
    }
}