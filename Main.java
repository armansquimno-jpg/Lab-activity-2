public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();

        v1.brand = "Ford";
        v1.model = "Mustang";
        v1.year = 2022;

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is vintage? " + v1.isVintage());
        System.out.println();

        v2.brand = "Volkswagen";
        v2.model = "Beetle";
        v2.year = 1968;

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is vintage? " + v2.isVintage());
        System.out.println();

        v3.brand = "Honda";
        v3.model = "Civic";
        v3.year = 2010;

        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is vintage? " + v3.isVintage());
        System.out.println();

    }
}