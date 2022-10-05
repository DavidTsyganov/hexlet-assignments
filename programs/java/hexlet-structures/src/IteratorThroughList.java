import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorThroughList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Facebook");
        list.add("PayPal");
        list.add("Google");
        list.add("Yahoo");

        // Way #1. Simple For loop
        System.out.println("==============> 1. Simple For loop Example.");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Way #2. For-each loop
        System.out.println("\n==============> 2. New Enhanced For loop Example..");
        for (String element : list) {
            System.out.println(element);
        }

        // Way #3. Using Iterator
        System.out.println("\n==============> 3. Iterator Example...");
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Way #4. Using ListIterator()
        System.out.println("\n==============> 4. ListIterator Example...");
        ListIterator<String> listIterator1 = list.listIterator();
        while(listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }

        
    }
}
