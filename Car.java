/*
 Car extends Vehicle because it shares basic properties.
 Added Discountable so we can apply discounts if needed.
*/

public class Car extends Vehicle implements Discountable {

    private int doors;

    public Car(String brand, double price, int doors){
        super(brand, price);
        this.doors = doors;
    }

    @Override
    public double calculateTax(){
        return price * 0.10;
    }

    @Override
    public double applyDiscount(double percent){
        return price - (price * percent / 100);
    }
}