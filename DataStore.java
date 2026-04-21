import java.util.*;

/*
Generic class so that we do not have to redefine the same thing again and again for
different data types
*/

public class DataStore<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    public ArrayList<T> getAll(){
        return list;
    }
}