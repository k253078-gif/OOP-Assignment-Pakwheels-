/*Buyer extends user */
public class Buyer extends User {

    public Buyer(String name){
        super(name);
    }

    @Override
    public void displayRole(){
        System.out.println("Buyer");
    }
}