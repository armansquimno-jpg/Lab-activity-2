public class Refactor {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Land Rover", "Defender", 2020);

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is vintage? " + v1.isVintage());
        System.out.println();

        Vehicle v2 = new Vehicle("Toyota", "Corolla", 1995);

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is vintage? " + v2.isVintage());
        System.out.println();

        Vehicle v3 = new Vehicle("BMW", "Sedan", 2018);

        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is vintage? " + v3.isVintage());
        System.out.println();
    }
}