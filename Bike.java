/*Bike is also a extended from vehicle here as it
has various similar attributes and functionality*/

public class Bike extends Vehicle {

    public Bike(String brand, double price){
        super(brand, price);
    }

    @Override
    public double calculateTax(){
        return price * 0.08;
    }
}