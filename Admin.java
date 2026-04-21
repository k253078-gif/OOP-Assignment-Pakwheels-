/*
 Admin exists to control listings.
 it shows role hierarchy clearly.
*/

public class Admin extends User {

    public Admin(String name){
        super(name);
    }

    public void approveListing(VehicleListing l){
        System.out.println("Approved by admin");
    }

    @Override
    public void displayRole(){
        System.out.println("Admin");
    }
}