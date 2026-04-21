import java.util.*;

public class Marketplace implements Searchable {

    private ArrayList<Seller> sellers = new ArrayList<>();
    private ArrayList<Admin> admins = new ArrayList<>();
    private ArrayList<Review> reviews = new ArrayList<>();
    private ArrayList<VehicleListing> listings = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void seedData(){

        Seller s1 = new Seller("Ali");
        sellers.add(s1);

        Admin a1 = new Admin("Admin");
        admins.add(a1);

        Vehicle v1 = new Car("Toyota", 2000000, 4);
        Vehicle v2 = new ElectricCar("Tesla", 5000000, 4, 80);

        listings.add(new VehicleListing(v1));
        listings.add(new VehicleListing(v2));
    }

    public void menu(){
        int ch;
        do{
            System.out.println("\n1. View Listings");
            System.out.println("2. Add Vehicle");
            System.out.println("3. Search");
            System.out.println("4. Payment");
            System.out.println("5. Add Review");
            System.out.println("0. Exit");

            ch = sc.nextInt(); sc.nextLine();

            switch(ch){
                case 1 -> view();
                case 2 -> add();
                case 3 -> search();
                case 4 -> payment();
                case 5 -> addReview();
            }

        }while(ch != 0);
    }

    private void view(){
        for(VehicleListing l : listings){
            System.out.println(l.getDetails());
        }
    }

    private void add(){

        System.out.println("1.Car 2.Electric 3.Bike");
        int type = sc.nextInt(); sc.nextLine();

        System.out.print("Brand: ");
        String b = sc.nextLine();

        System.out.print("Price: ");
        double p = sc.nextDouble();

        Vehicle v;

        // using parent reference so same variable works for all types
        if(type == 1) v = new Car(b,p,4);
        else if(type == 2) v = new ElectricCar(b,p,4,70);
        else v = new Bike(b,p);

        listings.add(new VehicleListing(v));
    }


    // interface method
    public void search(){

        System.out.print("Enter brand: ");
        String b = sc.nextLine();

        System.out.print("Max price: ");
        double p = sc.nextDouble();
        sc.nextLine();

        SearchFilter filter = new SearchFilter(b, p);

        for(VehicleListing l : listings){
            if(l.getVehicle().brand.equalsIgnoreCase(filter.brand)
                    && l.getVehicle().price <= filter.maxPrice){

                System.out.println(l.getDetails());
            }
        }
    }
    private void addReview(){

        System.out.print("Enter rating: ");
        int r = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter comment: ");
        String c = sc.nextLine();

        Review rev = new Review(r, c);
        reviews.add(rev);

        System.out.println("Review added");
    }

    private void payment(){

        Payment p = new CardPayment(5000);
        p.processPayment();

        Payment.Logger.log("Payment done");
    }
}
