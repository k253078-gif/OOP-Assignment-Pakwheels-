/*
 All users share id and name, so made this a base class.
 displayRole() is abstract because each type has its own role.
*/

public abstract class User {

    protected static int counter = 1;
    protected int id;
    protected String name;

    public User(String name){
        this.id = counter++;
        this.name = name;
    }

    public abstract void displayRole();
}