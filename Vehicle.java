/*
 Vehicle is kept abstract because different vehicle types
 have different tax rules. Instead of forcing one formula,
 each subclass handles it its own way.
*/

public abstract class Vehicle implements Taxable {

    protected String brand;
    protected double price;

    public Vehicle(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public abstract double calculateTax();

    public String getDetails(){
        return brand + " | Rs." + price;
    }

    // Member inner class: Engine belongs to a vehicle
    // Because engine doesn't exist without vehicle
    class Engine {
        int hp;

        Engine(int hp){
            this.hp = hp;
        }
    }
}