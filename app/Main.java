package app;

import contracts.Serviceable;
import devices.Printer;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import vehicles.Vehicle;

public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.moveForward();
			vehicle.moveBackwards();
			vehicle.moveLeft();
			vehicle.moveRight();
            System.out.println(" ");
			
		}

        public static void performService(Serviceable item){
			item.service();
		}

	public static void main(String[] args) {

		Serviceable car = new Car("Land Rover", "Defender", 2020, 4);
		Serviceable motor = new Motorcycle("Honda", "ADV160", 2026, 160);
		Serviceable truck = new Truck("Isuzu", "FRR90MS", 2026, 6);
		Serviceable printer = new Printer();

	
		
		
		
		//Polymorphism using Arrays
		Vehicle[] vehicles = {
			new Car("Land Rover", "Defender", 2020, 4),
			new Motorcycle("Honda", "ADV160", 2026, 160),
			new Truck("Isuzu", "FRR90MS", 2026, 6)
		};
		
		for(Vehicle currentVehicle: vehicles){
			printDetails(currentVehicle);
		}

        	Serviceable[] service = {
			car,
			motor,
			truck,
			printer
		};

		System.out.println(" ");
		
		//Loop for serviceable
		for(Serviceable currentService: service){
			performService(currentService);
		}


}
}