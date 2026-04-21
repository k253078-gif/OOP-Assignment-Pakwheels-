/*
 PremiumBuyer just extends Buyer to show multilevel inheritance.
 it represents the buyers who have purchased the subscription
 while its functionality is almost same there are small differences
*/

public class PremiumBuyer extends Buyer {

    public PremiumBuyer(String name){
        super(name);
    }

    @Override
    public void displayRole(){
        System.out.println("Premium Buyer");
    }
}