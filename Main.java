public class Main {

public static void main(String[] args) {

Vehicle v1 = new Vehicle();
Vehicle v2 = new Vehicle();
Vehicle v3 = new Vehicle();

v1.brand = "Land Rover";
v1.model = "Defender";
v1.year = 2020;

v1.displayInfo();
System.out.println("Age: " + v1.calculateAge());
System.out.println("Is vintage? " + v1.isVintage());
System.out.println();

v2.brand = "Toyota";
v2.model = "Corolla ";
v2.year = 1995;

v2.displayInfo();
System.out.println("Age: " + v2.calculateAge());
System.out.println("Is vintage? " + v2.isVintage());
System.out.println();

v3.brand = "BMW";
v3.model = "Sedan";
v3.year = 2018;

v3.displayInfo();
System.out.println("Age: " + v3.calculateAge());
System.out.println("Is vintage? " + v3.isVintage());
System.out.println();


} 
  }