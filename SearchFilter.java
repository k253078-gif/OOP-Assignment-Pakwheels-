/*
 Instead of passing many parameters in search,
 they have been  grouped here
*/

public class SearchFilter {

    public String brand;
    public double maxPrice;

    public SearchFilter(String brand, double maxPrice){
        this.brand = brand;
        this.maxPrice = maxPrice;
    }
}