/*Card payment extends the abstract class payment
 */

public class CardPayment extends Payment {

    public CardPayment(double amount){
        super(amount);
    }

    @Override
    public void processPayment(){

        // Local class: only needed here
        class Validator {
            boolean valid(){
                return amount > 0;
            }
        }

        Validator v = new Validator();

        if(v.valid()){
            System.out.println("Card payment successful");
        } else {
            System.out.println("Invalid amount");
        }
    }
}