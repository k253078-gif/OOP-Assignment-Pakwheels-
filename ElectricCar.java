/*
 ElectricCar is just a special type of Car.
 added it to show the use multilevel inheritance.
*/

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar(String brand, double price, int doors, int battery){
        super(brand, price, doors);
        this.battery = battery;
    }

    @Override
    public double calculateTax(){
        return price * 0.05; // lower tax for electric
    }
}