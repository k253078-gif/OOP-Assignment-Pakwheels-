/*Vehicle listing extends listing and overrides the listing while also
adding some of its own functionality */

public class VehicleListing extends Listing {

    private Vehicle vehicle;

    public VehicleListing(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public String getDetails(){
        return vehicle.getDetails() + " | Tax: " + vehicle.calculateTax();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}