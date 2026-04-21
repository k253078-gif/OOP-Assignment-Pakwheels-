/*Cash payment also extends the abstract class payment
this shows hierarchy
 */

public class CashPayment extends Payment {

    public CashPayment(double amount){
        super(amount);
    }

    @Override
    public void processPayment(){
        System.out.println("Cash payment done");
    }
}