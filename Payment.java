/*
 Payment is abstract because different payment methods behave differently.
 like: cash or credit cards
*/

public abstract class Payment {

    protected double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public abstract void processPayment();

    // Static nested class: used globally, no object needed
    static class Logger {
        public static void log(String msg){
            System.out.println("LOG: " + msg);
        }
    }
}