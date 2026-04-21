/*
 Listing is made abstract so we can later extend it
 for anu types of lists like featured listings, auction listings, etc.
*/

public abstract class Listing {

    public abstract String getDetails();
}