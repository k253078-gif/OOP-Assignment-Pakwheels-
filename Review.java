/*
 Review is kept separate because multiple users can review one listing.
*/

public class Review {

    private int rating;
    private String comment;

    public Review(int rating, String comment){
        this.rating = rating;
        this.comment = comment;
    }

    public String toString(){
        return rating + "/5 - " + comment;
    }
}