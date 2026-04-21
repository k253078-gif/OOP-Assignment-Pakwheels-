import java.util.*;

/*
 Seller keeps their own vehicles.
Arraylist is used here because the number of cars a seller can own
is not defined
*/

public class Seller extends User {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Seller(String name){
        super(name);
    }

    public Vehicle addVehicle(Vehicle v){
        vehicles.add(v);
        return v;
    }

    @Override
    public void displayRole(){
        System.out.println("Seller");
    }
}