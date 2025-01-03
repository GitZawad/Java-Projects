import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        l1.add(3);
        l1.add(5);
        l1.add(8);
        l1.add(9);
        l1.add(2,10);
        l1.remove(2);

        l2.add("Mango");
        l2.add("Banana");
        l2.add("Strawberry");

        l3.add(15);
        l3.add(7);
        l3.add(9);
        l3.add(17);

        l1.addAll(0,l3);
        l2.addFirst("Apple");
        l1.set(5,11);

        Iterator<String> i = l2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        ListIterator<Integer> i2 = l1.listIterator(l1.size());//can use this to specify the index from which we can start the iteration.
        while(i2.hasPrevious()){
            System.out.println(i2.previous());
        }
    }
}