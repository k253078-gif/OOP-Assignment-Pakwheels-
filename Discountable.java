/*Interface of discountable which some classes implement if we want to ensure they
* have discounting functionality*/


public interface Discountable {
    double applyDiscount(double percent);
}