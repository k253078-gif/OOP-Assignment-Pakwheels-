import java.util.*;

/*Generic methods so multiple data types can be used
* achieving OOPs principle of reusability*/
public class Utility {

    public static <T> void printAll(ArrayList<T> list){
        for(T item : list){
            System.out.println(item);
        }
    }

    public static <T> void swap(ArrayList<T> list, int i, int j){
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // Added search to fully meet requirement
    public static <T> void search(ArrayList<T> list, T key){
        for(T item : list){
            if(item.equals(key)){
                System.out.println("Found: " + item);
            }
        }
    }
}