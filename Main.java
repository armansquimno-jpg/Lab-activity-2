public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.displayInfo();
			vehicle.moveForward();
			vehicle.moveBackwards();
			vehicle.moveLeft();
			vehicle.moveRight();
			
		}

	public static void main(String[] args) {
		
		
		System.out.println(" ");
		//Polymorphism using Arrays
		Vehicle[] vehicles = {
			new Car("Land Rover", "Defender", 2020, 4),
			new Motorcycle("Honda", "ADV160", 2026, 160),
			new Truck("Isuzu", "FRR90MS", 2026, 6)
		};
		
		for(Vehicle currentVehicle: vehicles){
			printDetails(currentVehicle);
		}

}
}