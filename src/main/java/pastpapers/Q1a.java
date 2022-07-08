package pastpapers;

import java.util.ArrayList;
import java.util.List;

interface IVehicle {
    void displayVehicles();
}

public class Q1a {
    public static void vehicleList(){

        List<String> vehicles = new ArrayList<String>();
        vehicles.add("Car");
        vehicles.add("Bus");
        vehicles.add("Van");
        vehicles.add("Jeep");
        vehicles.add("Lorry");

        // Method Reference to an instance method of an object
        // (e) -> System.out.println(e) can be converted as System.out::println using Method Reference
        vehicles.forEach(System.out::println);
    }


    public static void main(String[] args) {

        // Static method reference
        IVehicle iVehicle = Q1a::vehicleList;
        iVehicle.displayVehicles();
    }
};


